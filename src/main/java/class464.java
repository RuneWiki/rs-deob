import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class464 {

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lae;")
    public static class40 field6703 = new class40(2);

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lnj;")
    public static class487 field6705 = new class487("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field6704;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6706;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2755(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 6)
    public static void method2751(int arg0) {
        field6703 = null;
        if (arg0 == 2) {
            field6705 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lob;ZLmaa;Lqa;II)Z", line = 17)
    public static final boolean method2752(class385 arg0, boolean arg1, class42 arg2, class167 arg3, int arg4, int arg5) {
        field6701++;
        if (!arg1) {
            method2752(null, false, null, null, -78, 39);
        }
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field477 != null) {
            var6 = (class113.field1454 - class113.field1437) * (arg0.field5630 + arg2.field479 - class113.field1436) / (class113.field1448 - class113.field1436) + class113.field1437;
            var7 = (arg0.field5630 + arg2.field497 - class113.field1436) * (class113.field1454 - class113.field1437) / (class113.field1448 - class113.field1436) + class113.field1437;
            var8 = class113.field1450 - ((arg0.field5627 + arg2.field506 - class113.field1447) * (class113.field1450 - class113.field1440) / (class113.field1442 - class113.field1447));
            var9 = class113.field1450 - (class113.field1450 - class113.field1440) * (arg2.field508 + arg0.field5627 - class113.field1447) / (class113.field1442 - class113.field1447);
        }
        class116 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field511 != -1) {
            if (arg0.field5637 && arg2.field484 != -1) {
                var10 = arg2.method226(arg3, true, (byte) 50);
            } else {
                var10 = arg2.method226(arg3, false, (byte) 50);
            }
            if (var10 != null) {
                var11 = arg0.field5634 - (var10.method722() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg0.field5634 + (var10.method722() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg0.field5631 - (var10.method714() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg0.field5631 + (var10.method714() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class440 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field483 != null) {
            var15 = class252.method1599(arg2.field476, 73);
            if (var15 != null) {
                var16 = class63.field735.method1052(class180.field2774, (byte) -118, null, null, arg2.field483);
                int var23 = arg0.field5631;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2687() / 2;
                } else {
                    var17 = var23 - ((var10.method714() >> 1) + var16 * var15.method2681());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class180.field2774[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2685(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4 + arg0.field5634 - (var18 / 2);
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = arg0.field5634 + (var18 / 2) + arg4;
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg5 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = arg5 + var16 * var15.method2681() + var17;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class113.field1437 || class113.field1454 < var6 || var9 < class113.field1440 || var8 > class113.field1450) {
            return true;
        }
        if (arg2.field477 != null) {
            int[] var27 = new int[arg2.field477.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg2.field477[var28 * 2] + arg0.field5630;
                int var31 = arg2.field477[var28 * 2 + 1] + arg0.field5627;
                var27[var28 * 2] = class113.field1437 + ((class113.field1454 - class113.field1437) * (var30 - class113.field1436) / (class113.field1448 - class113.field1436));
                var27[var28 * 2 + 1] = class113.field1450 - ((class113.field1450 - class113.field1440) * (var31 - class113.field1447) / (class113.field1442 - class113.field1447));
            }
            class230.method1507(arg3, var27, arg2.field498);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg3.method1065(var27[var29 * 2 + 2 + 1], var27[var29 * 2 + 2], arg2.field474, 75, var27[var29 * 2], var27[var29 * 2 + 1]);
            }
            arg3.method1065(var27[1], var27[0], arg2.field474, -111, var27[var27.length - 2], var27[var27.length - 1]);
        }
        if (var10 != null) {
            if (class59.field710 > 0 && (class467.field6744 != -1 && class467.field6744 == arg0.field5633 || class535.field7925 != -1 && class535.field7925 == arg2.field470)) {
                int var32;
                if (class181.field2785 > 50) {
                    var32 = (100 - class181.field2785) * 2;
                } else {
                    var32 = class181.field2785 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method1070(1, var10.method718() / 2 + 7, arg0.field5631, arg0.field5634, var33);
                arg3.method1070(1, var10.method718() / 2 + 5, arg0.field5631, arg0.field5634, var33);
                arg3.method1070(1, var10.method718() / 2 + 3, arg0.field5631, arg0.field5634, var33);
                arg3.method1070(1, var10.method718() / 2 + 1, arg0.field5631, arg0.field5634, var33);
                arg3.method1070(1, var10.method718() / 2, arg0.field5631, arg0.field5634, var33);
            }
            var10.method723(arg0.field5634 - (var10.method722() >> 1), arg0.field5631 + -(var10.method714() >> 1));
        }
        if (arg2.field483 != null && var15 != null) {
            class227.method1485(arg3, arg0, (byte) 63, var16, var17, var18, var15, arg2);
        }
        if (arg2.field511 != -1 || arg2.field483 != null) {
            class328 var34 = new class328(arg0);
            var34.field4843 = var19;
            var34.field4841 = var12;
            var34.field4840 = var11;
            var34.field4838 = var20;
            var34.field4844 = var21;
            var34.field4847 = var13;
            var34.field4835 = var14;
            var34.field4842 = var22;
            class34.field391.method2492(var34, (byte) 30);
        }
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)[Lfo;", line = 237)
    public static final class22[] method2753(byte arg0) {
        if (arg0 == -88) {
            field6702++;
            return new class22[] { class238.field3476, class152.field1945, class202.field3017, class200.field2995, class238.field3482, class277.field4104, class178.field2700, class287.field4228, class228.field3355, class19.field169, class21.field188, class105.field1318, class93.field1153, class159.field2123, class110.field1396 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lnc;B)V", line = 248)
    public static final void method2754(class537 arg0, byte arg1) {
        field6704++;
        if (class526.field7777 == null) {
            return;
        }
        class438 var2 = null;
        if (arg0.field7945 == 0) {
            var2 = (class438) class491.method2972(arg0.field7941, arg0.field7940, arg0.field7948);
        }
        if (arg0.field7945 == 1) {
            var2 = (class438) class427.method2549(arg0.field7941, arg0.field7940, arg0.field7948);
        }
        if (arg0.field7945 == 2) {
            var2 = (class438) class488.method2956(arg0.field7941, arg0.field7940, arg0.field7948, field6706 == null ? (field6706 = method2755("ej")) : field6706);
        }
        if (arg0.field7945 == 3) {
            var2 = (class438) class287.method1784(arg0.field7941, arg0.field7940, arg0.field7948);
        }
        if (var2 == null) {
            arg0.field7937 = -1;
            arg0.field7949 = 0;
            arg0.field7944 = 0;
        } else {
            arg0.field7937 = var2.method173(34);
            arg0.field7944 = var2.method171(true);
            arg0.field7949 = var2.method170(-5527);
        }
        if (arg1 <= 1) {
            field6703 = null;
        }
    }
}
