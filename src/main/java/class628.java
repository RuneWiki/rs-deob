import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class628 {

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public int field9152 = -1;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "B")
    public byte field9163 = 0;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    private int field9166 = 0;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    private int field9167 = -1;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    private int field9157 = 0;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    private int field9161 = 128;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
    public boolean field9162 = false;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
    private int field9173 = 128;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    private int field9164 = 0;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "F")
    public static float field9169 = 0.0F;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "Lwg;")
    public static class58 field9150 = new class58(4);

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "Lbda;")
    public static class401 field9174 = new class401("LIVE", 0);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    private int field9158;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public int field9159;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "Lac;")
    public static class284 field9175;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "Lkr;")
    public static class329 field9176;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "Lmn;")
    public class60 field9156;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "[S")
    private short[] field9153;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "[S")
    private short[] field9155;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "[S")
    private short[] field9170;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "[S")
    private short[] field9171;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILge;B)V")
    private final void method3631(int arg0, class551 arg1, byte arg2) {
        if (arg2 >= -36) {
            this.method3633(-119, -62, -67, -88, null, 95, null);
        }
        if (arg0 == 1) {
            this.field9158 = arg1.method3090(-105);
        } else if (arg0 == 2) {
            this.field9152 = arg1.method3090(-121);
        } else if (arg0 == 4) {
            this.field9161 = arg1.method3090(-85);
        } else if (arg0 == 5) {
            this.field9173 = arg1.method3090(-96);
        } else if (arg0 == 6) {
            this.field9157 = arg1.method3090(-70);
        } else if (arg0 == 7) {
            this.field9166 = arg1.method3045(-125);
        } else if (arg0 == 8) {
            this.field9164 = arg1.method3045(-128);
        } else if (arg0 == 9) {
            this.field9167 = 8224;
            this.field9163 = 3;
        } else if (arg0 == 10) {
            this.field9162 = true;
        } else if (arg0 == 11) {
            this.field9163 = 1;
        } else if (arg0 == 12) {
            this.field9163 = 4;
        } else if (arg0 == 13) {
            this.field9163 = 5;
        } else if (arg0 == 14) {
            this.field9163 = 2;
            this.field9167 = arg1.method3045(-125) * 256;
        } else if (arg0 == 15) {
            this.field9163 = 3;
            this.field9167 = arg1.method3090(-87);
        } else if (arg0 == 16) {
            this.field9163 = 3;
            this.field9167 = arg1.method3048(-4);
        } else if (arg0 == 40) {
            int var6 = arg1.method3045(-125);
            this.field9153 = new short[var6];
            this.field9170 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field9170[var7] = (short) arg1.method3090(-112);
                this.field9153[var7] = (short) arg1.method3090(-86);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method3045(-128);
            this.field9155 = new short[var4];
            this.field9171 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9171[var5] = (short) arg1.method3090(-112);
                this.field9155[var5] = (short) arg1.method3090(-121);
            }
        }
        field9168++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    public static void method3632(boolean arg0) {
        field9174 = null;
        field9176 = null;
        if (arg0) {
            method3636(-66, null, -21, -57, -2, false);
        }
        field9175 = null;
        field9150 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIILqa;ILok;)Lr;")
    public final class521 method3633(int arg0, int arg1, int arg2, int arg3, class167 arg4, int arg5, class97 arg6) {
        if (arg0 != -17697) {
            method3636(44, null, -111, -124, -102, true);
        }
        field9154++;
        return this.method3635(arg6, null, 0, (byte) 2, 0, arg3, null, (byte) 100, arg5, 0, arg2, false, arg1, arg4);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLge;)V")
    public final void method3634(byte arg0, class551 arg1) {
        while (true) {
            int var3 = arg1.method3045(-127);
            if (var3 == 0) {
                field9172++;
                if (arg0 != 86) {
                    this.method3631(119, null, (byte) -61);
                    return;
                }
                return;
            }
            this.method3631(var3, arg1, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lok;Lsa;IBIILsa;BIIIZILqa;)Lr;")
    private final class521 method3635(class97 arg0, class544 arg1, int arg2, byte arg3, int arg4, int arg5, class544 arg6, byte arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12, class167 arg13) {
        field9160++;
        int var15 = arg10;
        class320 var16 = this.field9152 == -1 || arg5 == -1 ? null : arg0.method535(this.field9152, true);
        boolean var17 = arg11 & this.field9163 != 0;
        if (var16 != null) {
            var15 = arg10 | var16.method1993(arg5, false, arg12, arg7 - 100);
        }
        if (var17) {
            var15 |= this.field9163 == 3 ? 7 : 2;
        }
        if (this.field9173 != 128) {
            var15 |= 0x2;
        }
        if (this.field9161 != 128 || this.field9157 != 0) {
            var15 |= 0x5;
        }
        class58 var18 = this.field9156.field839;
        class521 var19;
        synchronized (this.field9156.field839) {
            var19 = (class521) this.field9156.field839.method323((long) (this.field9159 |= arg13.field2115 << 29), -19814);
        }
        if (var19 == null || arg13.method921(var19.method1601(), var15) != 0) {
            if (var19 != null) {
                var15 = arg13.method938(var15, var19.method1601());
            }
            int var20 = var15;
            if (this.field9170 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field9171 != null) {
                var20 |= 0x8000;
            }
            class528 var21 = class624.method3603(arg7 - 139, 0, this.field9158, this.field9156.field823);
            if (var21 == null) {
                return null;
            }
            if (var21.field7380 < 13) {
                var21.method2949(2, -88);
            }
            var19 = arg13.method197(var21, var20, this.field9156.field840, this.field9166 + 64, this.field9164 + 850);
            if (this.field9170 != null) {
                for (int var22 = 0; var22 < this.field9170.length; var22++) {
                    var19.method1587(this.field9170[var22], this.field9153[var22]);
                }
            }
            if (this.field9171 != null) {
                for (int var23 = 0; var23 < this.field9171.length; var23++) {
                    var19.method1586(this.field9171[var23], this.field9155[var23]);
                }
            }
            var19.method1583(var15);
            class58 var24 = this.field9156.field839;
            synchronized (this.field9156.field839) {
                this.field9156.field839.method316((long) (this.field9159 |= arg13.field2115 << 29), (byte) -110, var19);
            }
        }
        if (arg7 != 100) {
            return null;
        }
        class521 var25 = var16 == null ? var19.method1607(arg3, var15, true) : var16.method1995(arg5, 32, arg8, var15, arg12, arg3, var19, 0);
        if (this.field9161 != 128 || this.field9173 != 128) {
            var25.method1566(this.field9161, this.field9173, this.field9161);
        }
        if (this.field9157 != 0) {
            if (this.field9157 == 90) {
                var25.method1567(4096);
            }
            if (this.field9157 == 180) {
                var25.method1567(8192);
            }
            if (this.field9157 == 270) {
                var25.method1567(12288);
            }
        }
        if (var17) {
            var25.method1606(this.field9163, this.field9167, arg6, arg1, arg2, arg4, arg9);
        }
        var25.method1583(arg10);
        return var25;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILkr;IIIZ)V")
    public static final void method3636(int arg0, class329 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class474.field6695 = arg4;
        class236.field3031 = arg5;
        if (arg2 != 16778) {
            return;
        }
        class148.field1924 = 10000;
        class463.field6597 = 1;
        field9165++;
        class217.field2773 = arg1;
        class148.field1917 = arg3;
        class341.field4743 = arg0;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZIILqa;BILsa;IIILsa;Lok;)Lr;")
    public final class521 method3637(int arg0, boolean arg1, int arg2, int arg3, class167 arg4, byte arg5, int arg6, class544 arg7, int arg8, int arg9, int arg10, class544 arg11, class97 arg12) {
        field9148++;
        if (arg5 <= 42) {
            this.field9155 = null;
        }
        return this.method3635(arg12, arg11, arg6, (byte) 2, arg9, arg3, arg7, (byte) 100, arg2, arg10, arg0, arg1, arg8, arg4);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIILok;Lqa;II)Lr;")
    public final class521 method3638(boolean arg0, int arg1, int arg2, class97 arg3, class167 arg4, int arg5, int arg6) {
        field9151++;
        if (!arg0) {
            this.field9161 = -73;
        }
        return this.method3635(arg3, null, 0, (byte) 5, 0, arg2, null, (byte) 100, arg5, 0, arg6, false, arg1, arg4);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static final void method3639(int arg0) {
        field9149++;
        if (class245.field3098 == 0) {
            return;
        }
        int var1 = -39 / ((72 - arg0) / 50);
        try {
            if (++class552.field7731 > 2000) {
                if (class96.field1294 != null) {
                    class96.field1294.method3271((byte) 110);
                    class96.field1294 = null;
                }
                if (class250.field3136 >= 1) {
                    class245.field3098 = 0;
                    class192.field2503 = -5;
                    return;
                }
                class15.field164.field3704 = !class15.field164.field3704;
                class552.field7731 = 0;
                class245.field3098 = 1;
                class250.field3136++;
            }
            if (class245.field3098 == 1) {
                class2.field19 = class31.field488.method1734(class15.field164.field3700, class15.field164.method1763(16311), -31887);
                class245.field3098 = 2;
            }
            if (class245.field3098 == 2) {
                if (class2.field19.field6001 == 2) {
                    throw new IOException();
                }
                if (class2.field19.field6001 != 1) {
                    return;
                }
                class96.field1294 = class223.method1424(13198, (Socket) class2.field19.field6000, 5000);
                class2.field19 = null;
                class96.field1294.method3265(class272.field3457.field7707, 0, (byte) 74, class272.field3457.field7693);
                class245.field3098 = 4;
            }
            if (class245.field3098 == 4) {
                if (!class96.field1294.method3270(-93, 1)) {
                    return;
                }
                class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                int var2 = class342.field4758.field7693[0] & 0xFF;
                if (var2 != 21) {
                    class192.field2503 = var2;
                    class245.field3098 = 0;
                    class96.field1294.method3271((byte) 110);
                    class96.field1294 = null;
                    return;
                }
                class245.field3098 = 5;
            }
            if (class245.field3098 == 5) {
                if (!class96.field1294.method3270(-92, 1)) {
                    return;
                }
                class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                class515.field7170 = new String[class342.field4758.field7693[0] & 0xFF];
                class245.field3098 = 6;
            }
            if (class245.field3098 == 6 && class96.field1294.method3270(72, class515.field7170.length * 8)) {
                class342.field4758.field7707 = 0;
                class96.field1294.method3267(-25750, class515.field7170.length * 8, 0, class342.field4758.field7693);
                for (int var3 = 0; var3 < class515.field7170.length; var3++) {
                    class515.field7170[var3] = class387.method2338((byte) -126, class342.field4758.method3072(-24373));
                }
                class192.field2503 = 21;
                class245.field3098 = 0;
                class96.field1294.method3271((byte) 110);
                class96.field1294 = null;
            }
        } catch (IOException var4) {
            if (class96.field1294 != null) {
                class96.field1294.method3271((byte) 110);
                class96.field1294 = null;
            }
            if (class250.field3136 >= 1) {
                class245.field3098 = 0;
                class192.field2503 = -4;
            } else {
                class552.field7731 = 0;
                class15.field164.field3704 = !class15.field164.field3704;
                class245.field3098 = 1;
                class250.field3136++;
            }
        }
    }

    static {
        new class344("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    }
}
