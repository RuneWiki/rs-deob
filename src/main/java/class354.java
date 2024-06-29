import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class354 {

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "Z")
    public boolean field5141 = false;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "Lui;")
    private class251 field5132 = new class251(64);

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "Lui;")
    public class251 field5143 = new class251(500);

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Lui;")
    public class251 field5144 = new class251(30);

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "Lui;")
    public class251 field5145 = new class251(50);

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "Lfs;")
    private class796 field5136;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Llga;")
    private class47 field5126;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
    public boolean field5134;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    private int field5138;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "Llga;")
    public class47 field5140;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field5147;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5148 = new String[] { method2837(method2836("\u001c\u0002\u0013m`")), method2837(method2836("\u001c\u0002\u0013\u0013!\u001a\u0004I\u0011`")), method2837(method2836("\u000fC\u0013\u00015")), method2837(method2836("\u001a\u0018QC")), method2837(method2836("\u001c\u0002\u0013d`")), method2837(method2836("\u001c\u0002\u0013g`")), method2837(method2836("\u001c\u0002\u0013j`")), method2837(method2836("\u001c\u0002\u0013h`")), method2837(method2836("\u001c\u0002\u0013e`")), method2837(method2836("\u001c\u0002\u0013n`")), method2837(method2836("\u001c\u0002\u0013f`")), method2837(method2836("\u001c\u0002\u0013l`")), method2837(method2836("\u001c\u0002\u0013k`")), method2837(method2836("\u001c\u0002\u0013i`")) };

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field5135 = 0;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Lsb;")
    public static class261 field5128 = new class261(69, -1);

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public int field5146;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method2825(boolean arg0, int arg1) {
        try {
            field5131++;
            if (arg1 > -61) {
                this.field5126 = null;
            }
            if (arg0 != this.field5141) {
                this.field5141 = arg0;
                this.method2827(-20947);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5148[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 19)
    public final void method2826(int arg0) {
        try {
            class251 var2 = this.field5132;
            synchronized (this.field5132) {
                this.field5132.method2047(11914);
            }
            field5129++;
            class251 var3 = this.field5143;
            synchronized (this.field5143) {
                this.field5143.method2047(11914);
            }
            class251 var4 = this.field5144;
            synchronized (this.field5144) {
                if (arg0 < 11) {
                    field5133 = -46;
                }
                this.field5144.method2047(11914);
            }
            class251 var5 = this.field5145;
            synchronized (this.field5145) {
                this.field5145.method2047(11914);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5148[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V", line = 41)
    public final void method2827(int arg0) {
        try {
            field5123++;
            class251 var2 = this.field5132;
            synchronized (this.field5132) {
                this.field5132.method2043(false);
            }
            class251 var3 = this.field5143;
            synchronized (this.field5143) {
                this.field5143.method2043(false);
            }
            class251 var4 = this.field5144;
            synchronized (this.field5144) {
                if (arg0 != -20947) {
                    return;
                }
                this.field5144.method2043(false);
            }
            class251 var5 = this.field5145;
            synchronized (this.field5145) {
                this.field5145.method2043(false);
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field5148[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)V", line = 65)
    public final void method2828(int arg0, byte arg1) {
        try {
            class251 var3 = this.field5132;
            synchronized (this.field5132) {
                if (arg1 <= 6) {
                    return;
                }
                this.field5132.method2038(0, arg0);
            }
            field5127++;
            class251 var4 = this.field5143;
            synchronized (this.field5143) {
                this.field5143.method2038(0, arg0);
            }
            class251 var5 = this.field5144;
            synchronized (this.field5144) {
                this.field5144.method2038(0, arg0);
            }
            class251 var6 = this.field5145;
            synchronized (this.field5145) {
                this.field5145.method2038(0, arg0);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5148[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V", line = 87)
    public final void method2829(int arg0, boolean arg1) {
        try {
            if (arg0 != -1) {
                method2831(-41);
            }
            field5124++;
            if (arg1 != this.field5134) {
                this.field5134 = arg1;
                this.method2827(arg0 ^ 0x51D2);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5148[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 106)
    public static void method2830(int arg0) {
        try {
            if (arg0 == 500) {
                field5128 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5148[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 119)
    public static final void method2831(int arg0) {
        try {
            field5130++;
            if (!class707.field9885) {
                if (arg0 < 110) {
                    field5128 = null;
                }
                class707.field9885 = true;
                class238.field3441 += (-12.0F - class238.field3441) / 2.0F;
                class669.field9440 = true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5148[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)Lfw;", line = 139)
    public final class789 method2832(int arg0, int arg1) {
        try {
            field5139++;
            class251 var3 = this.field5132;
            class789 var4;
            synchronized (this.field5132) {
                var4 = (class789) this.field5132.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field5126;
            byte[] var6;
            synchronized (this.field5126) {
                var6 = this.field5126.method512(class155.method1303(12345678, arg1), class654.method4751((byte) -65, arg1), (byte) -98);
                if (arg0 <= 118) {
                    this.method2833((byte) 20, -64);
                }
            }
            class789 var7 = new class789();
            var7.field11478 = arg1;
            var7.field11411 = this;
            var7.field11385 = (String[]) this.field5147.clone();
            if (var6 != null) {
                var7.method5695(new class711(var6), (byte) -29);
            }
            var7.method5687(-25653);
            if (!this.field5134 && var7.field11460) {
                var7.field11385 = null;
                var7.field11395 = null;
            }
            if (var7.field11463) {
                var7.field11413 = false;
                var7.field11480 = 0;
            }
            class251 var8 = this.field5132;
            synchronized (this.field5132) {
                this.field5132.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field5148[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)V", line = 186)
    public final void method2833(byte arg0, int arg1) {
        try {
            field5125++;
            this.field5146 = arg1;
            class251 var3 = this.field5143;
            synchronized (this.field5143) {
                this.field5143.method2043(false);
            }
            class251 var4 = this.field5144;
            synchronized (this.field5144) {
                this.field5144.method2043(false);
            }
            class251 var5 = this.field5145;
            synchronized (this.field5145) {
                this.field5145.method2043(false);
                if (arg0 != -6) {
                    this.field5136 = null;
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5148[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V", line = 211)
    public final void method2834(int arg0, int arg1) {
        try {
            if (arg0 == 30) {
                field5142++;
                this.field5132 = new class251(arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5148[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(II)Z", line = 224)
    public static final boolean method2835(int arg0, int arg1) {
        try {
            field5137++;
            if (arg1 != 0) {
                field5133 = -123;
            }
            return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5148[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lfs;IZLlga;Llga;)V", line = 263)
    public class354(class796 arg0, int arg1, boolean arg2, class47 arg3, class47 arg4) {
        try {
            this.field5136 = arg0;
            this.field5126 = arg3;
            this.field5134 = arg2;
            this.field5138 = arg1;
            this.field5140 = arg4;
            if (this.field5126 != null) {
                int var6 = this.field5126.method535((byte) -110) - 1;
                this.field5126.method509(true, var6);
            }
            if (class378.field5530 == this.field5136) {
                this.field5147 = new String[] { null, null, null, null, null, class537.field7852.method4068((byte) -111, this.field5138) };
            } else {
                this.field5147 = new String[] { null, null, null, null, null, null };
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5148[1] + (arg0 == null ? field5148[3] : field5148[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5148[3] : field5148[2]) + ',' + (arg4 == null ? field5148[3] : field5148[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2836(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2837(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
