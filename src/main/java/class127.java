import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class127 extends class129 {

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Ljava/lang/String;")
    private String field2240 = "null";

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "C")
    public char field2230;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "C")
    public char field2236;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "Li;")
    public class112 field2232;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "Li;")
    private class112 field2239;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "Lvb;")
    public static class131 field2238;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method868(int arg0, int arg1) {
        field2224++;
        if (this.field2232 == null) {
            return this.field2240;
        }
        class292 var3 = (class292) this.field2232.method779(119, (long) arg0);
        if (arg1 != -4) {
            method872(113, -78, 107, -42, 23);
        }
        return var3 == null ? this.field2240 : var3.field4667;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    private final void method869(byte arg0) {
        field2241++;
        this.field2239 = new class112(this.field2232.method775((byte) -120));
        for (class69 var2 = (class69) this.field2232.method782(0); var2 != null; var2 = (class69) this.field2232.method788(true)) {
            class69 var3 = new class69((int) var2.field1515);
            this.field2239.method780((byte) -78, (long) var2.field1127, var3);
        }
        if (arg0 != -39) {
            this.method868(-29, -67);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method870(byte arg0, String arg1) {
        field2246++;
        if (arg0 > -115) {
            return false;
        } else if (this.field2232 == null) {
            return false;
        } else {
            if (this.field2239 == null) {
                this.method878(false);
            }
            for (class210 var3 = (class210) this.field2239.method779(65, class207.method1389(arg1, 29779)); var3 != null; var3 = (class210) this.field2239.method776(26952)) {
                if (var3.field3552.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Z")
    public final boolean method871(int arg0, int arg1) {
        if (arg1 != 9382) {
            return false;
        }
        field2243++;
        if (this.field2232 == null) {
            return false;
        }
        if (this.field2239 == null) {
            this.method869((byte) -39);
        }
        class69 var3 = (class69) this.field2239.method779(arg1 ^ 0xFFFFDB37, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)Lml;")
    public static final class13 method872(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2237++;
        long var5 = (long) arg3 << 48 & 0xFFFFL << 48 | 0xFFFFL << 32 & (long) arg2 << 32 | ((long) arg4 & 0xFFFFL) << 16 | (long) arg1 & 0xFFFFL;
        class13 var7 = (class13) class139.field2397.method57(var5, -109);
        if (arg0 != -4370) {
            field2234 = 94;
        }
        if (var7 != null) {
            return var7;
        }
        class257[] var8 = null;
        class134 var9 = class156.method1073(arg1, (byte) 80);
        if (var9.field2318 != null) {
            var8 = new class257[var9.field2318.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class290 var11 = class207.method1388(-37, var9.field2318[var10]);
                var8[var10] = new class257(var11.field4623, var11.field4624, var11.field4633, var11.field4631, var11.field4638, var11.field4628, var11.field4621, var11.field4627);
            }
        }
        class13 var12 = new class13(var9.field2321, var8, var9.field2314, arg3, arg2, arg4);
        class139.field2397.method62(0, var12, var5);
        return var12;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)I")
    public final int method873(int arg0, byte arg1) {
        field2245++;
        if (this.field2232 == null) {
            return this.field2235;
        } else if (arg1 == -100) {
            class69 var3 = (class69) this.field2232.method779(-124, (long) arg0);
            return var3 == null ? this.field2235 : var3.field1127;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Leh;IZ)V")
    private final void method874(class101 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2238 = null;
        }
        field2225++;
        if (arg1 == 1) {
            this.field2230 = class104.method708(true, arg0.method646(79));
        } else if (arg1 == 2) {
            this.field2236 = class104.method708(!arg2, arg0.method646(118));
        } else if (arg1 == 3) {
            this.field2240 = arg0.method662((byte) 1);
        } else if (arg1 == 4) {
            this.field2235 = arg0.method655((byte) 46);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method677(false);
            this.field2232 = new class112(class6.method33(var4, (byte) -85));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method655((byte) 43);
                class83 var7;
                if (arg1 == 5) {
                    var7 = new class292(arg0.method662((byte) 1));
                } else {
                    var7 = new class69(arg0.method655((byte) 56));
                }
                this.field2232.method780((byte) -78, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Leh;I)V")
    public final void method875(class101 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method669((byte) 36);
            if (var3 == 0) {
                field2231++;
                if (arg1 != 0) {
                    method880(108);
                    return;
                }
                return;
            }
            this.method874(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILvh;II)Z")
    public static final boolean method876(int arg0, class108 arg1, int arg2, int arg3) {
        if (arg3 != -8635) {
            field2227 = -125;
        }
        byte[] var4 = arg1.method746(arg0, (byte) -128, arg2);
        field2228++;
        if (var4 == null) {
            return false;
        } else {
            class216.method1438(33, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
    public static final int method877(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    private final void method878(boolean arg0) {
        field2229++;
        this.field2239 = new class112(this.field2232.method775((byte) -96));
        for (class292 var2 = (class292) this.field2232.method782(0); var2 != null; var2 = (class292) this.field2232.method788(!arg0)) {
            class210 var3 = new class210(var2.field4667, (int) var2.field1515);
            this.field2239.method780((byte) -78, class207.method1389(var2.field4667, 29779), var3);
        }
        if (arg0) {
            this.field2239 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method879(String arg0, String arg1, int arg2) {
        field2242++;
        int var3 = arg0.length();
        int var4 = arg1.length();
        if (arg2 != 1) {
            method881((byte) 36);
        }
        if (var3 < var4) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg1.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public static void method880(int arg0) {
        field2238 = null;
        if (arg0 != 1) {
            method877(65, 31);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
    public static final void method881(byte arg0) {
        field2233++;
        class80 var1 = class253.field4140;
        synchronized (class253.field4140) {
            class206.field3424++;
            class69.field1131 = class272.field4374;
            class48.field839 = class17.field207;
            if (arg0 != -106) {
                field2227 = 4;
            }
            class256.field4182 = class134.field2316;
            class100.field1717 = class165.field2704;
            class115.field2069 = class157.field2625;
            class160.field2668 = class37.field532;
            class288.field4600 = class114.field2053;
            class165.field2704 = 0;
        }
    }
}
