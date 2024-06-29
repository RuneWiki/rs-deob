import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class80 extends class378 {

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field1031 = 12;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field1034 = 104;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "[I")
    public static int[] field1038 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "J")
    public long field1040;

    static {
        new class349("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)I", line = 7)
    public final int method471(byte arg0) {
        int var2 = -39 / ((31 - arg0) / 46);
        field1035++;
        return this.field1036;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 23)
    public static void method472(int arg0) {
        if (arg0 != -7563) {
            field1038 = null;
        }
        field1038 = null;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(B)J", line = 33)
    public final long method473(byte arg0) {
        int var2 = 19 % ((1 - arg0) / 44);
        field1041++;
        return this.field1040;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I", line = 45)
    public final int method474(byte arg0) {
        int var2 = -55 / ((-arg0 - 45) / 48);
        field1039++;
        return this.field1042;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLsp;)V", line = 56)
    public static final void method475(byte arg0, class382 arg1) {
        field1037++;
        if (arg1 == null || class228.field3392.field6329 == arg1) {
            return;
        }
        int var2 = arg1.field5429;
        int var3 = arg1.field5424;
        int var4 = arg1.field5420;
        int var5 = (int) arg1.field5421;
        long var6 = arg1.field5421;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var8;
        int var9;
        if (class252.field3744 == null) {
            var8 = class260.field3849;
            var9 = class378.field5385;
        } else {
            var9 = class252.field3744.method476(arg0 + 120);
            var8 = class252.field3744.method471((byte) -37);
        }
        if (var4 == 12) {
            class64.field886 = var8;
            class222.field3178 = 0;
            class190.field2739++;
            class209.field2989 = var9;
            class426.field6084 = 2;
            class407.field5761.method2048(arg0 ^ 0xFFFFF802, 82);
            class407.field5761.method856(class342.field4959 + var3, arg0 + -1004744370);
            class407.field5761.method835(7740, class306.field4459 + var2);
            class407.field5761.method799(var5, 89);
            class407.field5761.method838(class16.field247.method1758(arg0 ^ 0x1F1, 82) ? 1 : 0, (byte) 77);
            class397.method2494(var3, true, var2);
        }
        if (var4 == 9) {
            class446 var10 = class442.field6317[var5];
            if (var10 != null) {
                class222.field3178 = 0;
                class426.field6084 = 2;
                class381.field5410++;
                class209.field2989 = var9;
                class64.field886 = var8;
                class407.field5761.method2048(2040, 129);
                class407.field5761.method835(7740, var5);
                class407.field5761.method846(105, class16.field247.method1758(-501, 82) ? 1 : 0);
                class452.method2815(class181.field2555.field4601[0], var10.field4595[0], var10.method773((byte) 45), class181.field2555.field4595[0], var10.method773((byte) 98), 0, true, (byte) -11, -2, 0, var10.field4601[0]);
            }
        }
        if (var4 == 45) {
            if (class316.field4628 > 0 && class16.field247.method1758(-501, 82) && class16.field247.method1758(arg0 - 495, 81)) {
                class97.method575(-13945, class306.field4459 + var2, class342.field4959 - -var3, class158.field2302);
            } else {
                class209.field2989 = var9;
                class426.field6084 = 1;
                class62.field831++;
                class222.field3178 = 0;
                class64.field886 = var8;
                class407.field5761.method2048(2040, 133);
                class407.field5761.method856(class342.field4959 + var3, -1004744376);
                class407.field5761.method799(class306.field4459 + var2, 106);
            }
        }
        if (var4 == 59) {
            class110.field1419++;
            class64.field886 = var8;
            class209.field2989 = var9;
            class426.field6084 = 2;
            class222.field3178 = 0;
            class407.field5761.method2048(2040, 231);
            class407.field5761.method856(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 ^ 0x3BE32EB2);
            class407.field5761.method856(class342.field4959 + var3, -1004744376);
            class407.field5761.method840(255, var2 + class306.field4459);
            class407.field5761.method840(255, class261.field3855);
            class407.field5761.method849(class128.field1814, (byte) -106);
            class407.field5761.method838(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) 122);
            class299.method2018(var6, -21482, var3, var2);
        }
        if (var4 == 3) {
            class128 var11 = class243.field3596[var5];
            if (var11 != null) {
                class222.field3178 = 0;
                class64.field886 = var8;
                class209.field2989 = var9;
                class289.field4205++;
                class426.field6084 = 2;
                class407.field5761.method2048(2040, 40);
                class407.field5761.method838(class16.field247.method1758(arg0 ^ 0x1F1, 82) ? 1 : 0, (byte) 121);
                class407.field5761.method835(arg0 ^ 0xFFFFE1C6, var5);
                class452.method2815(class181.field2555.field4601[0], var11.field4595[0], var11.method773((byte) 106), class181.field2555.field4595[0], var11.method773((byte) 22), 0, true, (byte) -11, -2, 0, var11.field4601[0]);
            }
        }
        if (var4 == 1004) {
            class209.field2989 = var9;
            class426.field6084 = 2;
            class247.field3698++;
            class222.field3178 = 0;
            class64.field886 = var8;
            class407.field5761.method2048(2040, 74);
            class407.field5761.method799(var5, 124);
        }
        if (var4 == 47) {
            class446 var12 = class442.field6317[var5];
            if (var12 != null) {
                class64.field886 = var8;
                class222.field3178 = 0;
                class118.field1601++;
                class426.field6084 = 2;
                class209.field2989 = var9;
                class407.field5761.method2048(2040, 88);
                class407.field5761.method856(class261.field3855, -1004744376);
                class407.field5761.method799(var5, arg0 ^ 0xFFFFFFD5);
                class407.field5761.method842(class128.field1814, 116);
                class407.field5761.method838(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) 113);
                class452.method2815(class181.field2555.field4601[0], var12.field4595[0], var12.method773((byte) 70), class181.field2555.field4595[0], var12.method773((byte) 103), 0, true, (byte) -11, -2, 0, var12.field4601[0]);
            }
        }
        if (var4 == 11 && class85.field1096 == null) {
            class206.method1461(var3, 41, var2);
            class85.field1096 = class299.method2016(var2, var3, (byte) 120);
            class245.method1701(class85.field1096, (byte) -94);
        }
        if (var4 == 10) {
            class446 var13 = class442.field6317[var5];
            if (var13 != null) {
                class206.field2952++;
                class64.field886 = var8;
                class222.field3178 = 0;
                class426.field6084 = 2;
                class209.field2989 = var9;
                class407.field5761.method2048(arg0 + 2046, 27);
                class407.field5761.method835(arg0 + 7746, var5);
                class407.field5761.method846(24, class16.field247.method1758(-501, 82) ? 1 : 0);
                class452.method2815(class181.field2555.field4601[0], var13.field4595[0], var13.method773((byte) 95), class181.field2555.field4595[0], var13.method773((byte) 111), 0, true, (byte) -11, -2, 0, var13.field4601[0]);
            }
        }
        if (var4 == 2) {
            class222.field3178 = 0;
            class426.field6084 = 2;
            class354.field5135++;
            class64.field886 = var8;
            class209.field2989 = var9;
            class407.field5761.method2048(2040, 221);
            class407.field5761.method799(class342.field4959 + var3, -109);
            class407.field5761.method846(119, class16.field247.method1758(-501, 82) ? 1 : 0);
            class407.field5761.method840(255, var5);
            class407.field5761.method799(var2 + class306.field4459, 118);
            class397.method2494(var3, true, var2);
        }
        if (var4 == 50) {
            class426.field6084 = 2;
            class64.field886 = var8;
            class222.field3178 = 0;
            class209.field2989 = var9;
            class232.field3424++;
            class407.field5761.method2048(2040, 29);
            class407.field5761.method840(arg0 + 261, class342.field4959 + var3);
            class407.field5761.method816(-1640531527, class16.field247.method1758(-501, 82) ? 1 : 0);
            class407.field5761.method840(255, var2 + class306.field4459);
            class407.field5761.method835(arg0 ^ 0xFFFFE1C6, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class299.method2018(var6, arg0 ^ 0x53EC, var3, var2);
        }
        if (var4 == 23) {
            class223 var14 = class299.method2016(var2, var3, (byte) 18);
            if (var14 != null) {
                class294.method1995(95, var14);
            }
        }
        if (var4 == 1003 || var4 == 1010 || var4 == 1006 || var4 == 1012 || var4 == 1009) {
            class52.method339(var2, (byte) 79, var5, var4);
        }
        if (var4 == 19) {
            class128 var15 = class243.field3596[var5];
            if (var15 != null) {
                class222.field3178 = 0;
                class209.field2989 = var9;
                class349.field5083++;
                class426.field6084 = 2;
                class64.field886 = var8;
                class407.field5761.method2048(2040, 120);
                class407.field5761.method846(62, class16.field247.method1758(-501, 82) ? 1 : 0);
                class407.field5761.method856(var5, arg0 ^ 0x3BE32EB2);
                class452.method2815(class181.field2555.field4601[0], var15.field4595[0], var15.method773((byte) 87), class181.field2555.field4595[0], var15.method773((byte) 39), 0, true, (byte) -11, -2, 0, var15.field4601[0]);
            }
        }
        if (var4 == 1001) {
            class222.field3178 = 0;
            class64.field886 = var8;
            class426.field6084 = 2;
            class209.field2989 = var9;
            class446 var16 = class442.field6317[var5];
            if (var16 != null) {
                class346 var17 = var16.field6375;
                if (var17.field5023 != null) {
                    var17 = var17.method2273(-1);
                }
                if (var17 != null) {
                    class260.field3838++;
                    class407.field5761.method2048(2040, 57);
                    class407.field5761.method835(7740, var17.field5027);
                }
            }
        }
        if (var4 == 46) {
            client.field2335++;
            class209.field2989 = var9;
            class64.field886 = var8;
            class222.field3178 = 0;
            class426.field6084 = 2;
            class407.field5761.method2048(2040, 32);
            class407.field5761.method831(class16.field247.method1758(arg0 - 495, 82) ? 1 : 0, (byte) 121);
            class407.field5761.method835(7740, class342.field4959 + var3);
            class407.field5761.method799(var5, -84);
            class407.field5761.method835(arg0 ^ 0xFFFFE1C6, class306.field4459 + var2);
            class397.method2494(var3, true, var2);
        }
        if (var4 == 49) {
            class446 var18 = class442.field6317[var5];
            if (var18 != null) {
                class426.field6084 = 2;
                class270.field3944++;
                class222.field3178 = 0;
                class209.field2989 = var9;
                class64.field886 = var8;
                class407.field5761.method2048(2040, 195);
                class407.field5761.method835(arg0 ^ 0xFFFFE1C6, var5);
                class407.field5761.method846(118, class16.field247.method1758(arg0 ^ 0x1F1, 82) ? 1 : 0);
                class452.method2815(class181.field2555.field4601[0], var18.field4595[0], var18.method773((byte) 59), class181.field2555.field4595[0], var18.method773((byte) 56), 0, true, (byte) -11, -2, 0, var18.field4601[0]);
            }
        }
        if (var4 == 8) {
            class128 var19 = class243.field3596[var5];
            if (var19 != null) {
                class426.field6084 = 2;
                class8.field106++;
                class64.field886 = var8;
                class209.field2989 = var9;
                class222.field3178 = 0;
                class407.field5761.method2048(arg0 ^ 0xFFFFF802, 46);
                class407.field5761.method838(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) 116);
                class407.field5761.method835(7740, var5);
                class452.method2815(class181.field2555.field4601[0], var19.field4595[0], var19.method773((byte) 122), class181.field2555.field4595[0], var19.method773((byte) 90), 0, true, (byte) -11, -2, 0, var19.field4601[0]);
            }
        }
        if (var4 == 60) {
            class222.field3178 = 0;
            class154.field2288++;
            class209.field2989 = var9;
            class426.field6084 = 2;
            class64.field886 = var8;
            class407.field5761.method2048(2040, 196);
            class407.field5761.method840(255, class306.field4459 + var2);
            class407.field5761.method840(255, var5);
            class407.field5761.method838(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) 89);
            class407.field5761.method856(class342.field4959 + var3, arg0 + -1004744370);
            class397.method2494(var3, true, var2);
        }
        if (var4 == 15) {
            class207.field2969++;
            class209.field2989 = var9;
            class222.field3178 = 0;
            class64.field886 = var8;
            class426.field6084 = 2;
            class407.field5761.method2048(2040, 237);
            class407.field5761.method799(var5, 100);
            class407.field5761.method846(69, class16.field247.method1758(-501, 82) ? 1 : 0);
            class407.field5761.method840(arg0 + 261, class306.field4459 + var2);
            class407.field5761.method856(class342.field4959 + var3, -1004744376);
            class397.method2494(var3, true, var2);
        }
        if (var4 == 48) {
            class64.field886 = var8;
            class54.field695++;
            class209.field2989 = var9;
            class426.field6084 = 1;
            class222.field3178 = 0;
            class407.field5761.method2048(arg0 ^ 0xFFFFF802, 67);
            class407.field5761.method808(class128.field1814, -6920);
            class407.field5761.method799(class306.field4459 + var2, 71);
            class407.field5761.method840(arg0 + 261, class261.field3855);
            class407.field5761.method840(255, class342.field4959 + var3);
            class452.method2815(class181.field2555.field4601[0], var2, 1, class181.field2555.field4595[0], 1, 0, true, (byte) -11, -4, 0, var3);
        }
        if (var4 == 1007) {
            class222.field3178 = 0;
            class209.field2989 = var9;
            class243.field3589++;
            class64.field886 = var8;
            class426.field6084 = 2;
            class407.field5761.method2048(arg0 + 2046, 198);
            class407.field5761.method840(arg0 + 261, var5);
        }
        if (var4 == 57) {
            if (class316.field4628 > 0 && class16.field247.method1758(arg0 ^ 0x1F1, 82) && class16.field247.method1758(arg0 - 495, 81)) {
                class97.method575(-13945, class306.field4459 + var2, class342.field4959 + var3, class158.field2302);
            } else {
                class319.method2122(var3, var5, var2, 127);
                if (var5 == 1) {
                    class407.field5761.method831(-1, (byte) -51);
                    class407.field5761.method831(-1, (byte) 116);
                    class407.field5761.method799((int) class358.field5176, -123);
                    class407.field5761.method831(57, (byte) -40);
                    class407.field5761.method831(class63.field842, (byte) 116);
                    class407.field5761.method831(class261.field3863, (byte) -100);
                    class407.field5761.method831(89, (byte) -46);
                    class407.field5761.method799(class181.field2555.field4463, -102);
                    class407.field5761.method799(class181.field2555.field4466, 85);
                    class407.field5761.method831(63, (byte) -121);
                } else {
                    class209.field2989 = var9;
                    class64.field886 = var8;
                    class222.field3178 = 0;
                    class426.field6084 = 1;
                }
                class452.method2815(class181.field2555.field4601[0], var2, 1, class181.field2555.field4595[0], 1, 0, true, (byte) -11, -4, 0, var3);
            }
        }
        if (var4 == 21) {
            class128 var20 = class243.field3596[var5];
            if (var20 != null) {
                class209.field2989 = var9;
                class222.field3178 = 0;
                class64.field886 = var8;
                class426.field6084 = 2;
                class87.field1130++;
                class407.field5761.method2048(2040, 145);
                class407.field5761.method816(arg0 ^ 0x61C88643, class16.field247.method1758(arg0 - 495, 82) ? 1 : 0);
                class407.field5761.method799(var5, arg0 ^ 0xFFFFFFD4);
                class452.method2815(class181.field2555.field4601[0], var20.field4595[0], var20.method773((byte) 50), class181.field2555.field4595[0], var20.method773((byte) 37), 0, true, (byte) -11, -2, 0, var20.field4601[0]);
            }
        }
        if (var4 == 1002) {
            class209.field2989 = var9;
            class426.field6084 = 2;
            class270.field3945++;
            class64.field886 = var8;
            class222.field3178 = 0;
            class407.field5761.method2048(2040, 61);
            class407.field5761.method799((int) (var6 >>> 32) & Integer.MAX_VALUE, 68);
            class407.field5761.method799(var3 + class342.field4959, arg0 + 103);
            class407.field5761.method856(class306.field4459 + var2, arg0 ^ 0x3BE32EB2);
            class407.field5761.method831(class16.field247.method1758(arg0 - 495, 82) ? 1 : 0, (byte) -43);
            class299.method2018(var6, -21482, var3, var2);
        }
        if (var4 == 17) {
            class64.field886 = var8;
            class426.field6084 = 2;
            class1.field1++;
            class222.field3178 = 0;
            class209.field2989 = var9;
            class407.field5761.method2048(arg0 ^ 0xFFFFF802, 140);
            class407.field5761.method840(255, class306.field4459 + var2);
            class407.field5761.method840(255, class342.field4959 + var3);
            class407.field5761.method840(255, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class407.field5761.method846(92, class16.field247.method1758(-501, 82) ? 1 : 0);
            class299.method2018(var6, arg0 - 21476, var3, var2);
        }
        if (var4 == 6) {
            class446 var21 = class442.field6317[var5];
            if (var21 != null) {
                class222.field3178 = 0;
                class451.field6464++;
                class209.field2989 = var9;
                class426.field6084 = 2;
                class64.field886 = var8;
                class407.field5761.method2048(arg0 ^ 0xFFFFF802, 62);
                class407.field5761.method856(var5, -1004744376);
                class407.field5761.method846(arg0 ^ 0xFFFFFFAC, class16.field247.method1758(arg0 - 495, 82) ? 1 : 0);
                class452.method2815(class181.field2555.field4601[0], var21.field4595[0], var21.method773((byte) 113), class181.field2555.field4595[0], var21.method773((byte) 76), 0, true, (byte) -11, -2, 0, var21.field4601[0]);
            }
        }
        if (var4 == 51) {
            class59.field806++;
            class426.field6084 = 2;
            class222.field3178 = 0;
            class64.field886 = var8;
            class209.field2989 = var9;
            class407.field5761.method2048(2040, 187);
            class407.field5761.method846(76, class16.field247.method1758(-501, 82) ? 1 : 0);
            class407.field5761.method835(7740, class306.field4459 + var2);
            class407.field5761.method856(class342.field4959 + var3, -1004744376);
            class407.field5761.method835(7740, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class299.method2018(var6, -21482, var3, var2);
        }
        if (var4 == 30) {
            class222.field3178 = 0;
            class438.field6260++;
            class64.field886 = var8;
            class209.field2989 = var9;
            class426.field6084 = 2;
            class407.field5761.method2048(arg0 ^ 0xFFFFF802, 128);
            class407.field5761.method849(class128.field1814, (byte) -105);
            class407.field5761.method835(7740, class342.field4959 + var3);
            class407.field5761.method831(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) 117);
            class407.field5761.method835(7740, class306.field4459 + var2);
            class407.field5761.method799(var5, arg0 ^ 0x5F);
            class407.field5761.method856(class261.field3855, -1004744376);
            class397.method2494(var3, true, var2);
        }
        if (var4 == 5) {
            class128 var22 = class243.field3596[var5];
            if (var22 != null) {
                class445.field6353++;
                class209.field2989 = var9;
                class64.field886 = var8;
                class222.field3178 = 0;
                class426.field6084 = 2;
                class407.field5761.method2048(2040, 93);
                class407.field5761.method840(arg0 ^ 0xFFFFFF05, var5);
                class407.field5761.method831(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) -122);
                class452.method2815(class181.field2555.field4601[0], var22.field4595[0], var22.method773((byte) 38), class181.field2555.field4595[0], var22.method773((byte) 59), 0, true, (byte) -11, -2, 0, var22.field4601[0]);
            }
        }
        if (var4 == 25) {
            class446 var23 = class442.field6317[var5];
            if (var23 != null) {
                class64.field886 = var8;
                class426.field6084 = 2;
                class222.field3178 = 0;
                class175.field2455++;
                class209.field2989 = var9;
                class407.field5761.method2048(arg0 + 2046, 13);
                class407.field5761.method835(arg0 + 7746, var5);
                class407.field5761.method846(103, class16.field247.method1758(-501, 82) ? 1 : 0);
                class452.method2815(class181.field2555.field4601[0], var23.field4595[0], var23.method773((byte) 103), class181.field2555.field4595[0], var23.method773((byte) 121), 0, true, (byte) -11, -2, 0, var23.field4601[0]);
            }
        }
        if (var4 == 58) {
            class128 var24 = class243.field3596[var5];
            if (var24 != null) {
                class222.field3178 = 0;
                class242.field3585++;
                class426.field6084 = 2;
                class64.field886 = var8;
                class209.field2989 = var9;
                class407.field5761.method2048(2040, 59);
                class407.field5761.method816(-1640531527, class16.field247.method1758(-501, 82) ? 1 : 0);
                class407.field5761.method799(var5, -78);
                class452.method2815(class181.field2555.field4601[0], var24.field4595[0], var24.method773((byte) 51), class181.field2555.field4595[0], var24.method773((byte) 123), 0, true, (byte) -11, -2, 0, var24.field4601[0]);
            }
        }
        if (var4 == 4) {
            class128 var25 = class243.field3596[var5];
            if (var25 != null) {
                class426.field6084 = 2;
                class222.field3178 = 0;
                class64.field886 = var8;
                class209.field2989 = var9;
                class241.field3560++;
                class407.field5761.method2048(2040, 199);
                class407.field5761.method838(class16.field247.method1758(arg0 ^ 0x1F1, 82) ? 1 : 0, (byte) 111);
                class407.field5761.method856(var5, -1004744376);
                class452.method2815(class181.field2555.field4601[0], var25.field4595[0], var25.method773((byte) 71), class181.field2555.field4595[0], var25.method773((byte) 32), 0, true, (byte) -11, -2, 0, var25.field4601[0]);
            }
        }
        if (var4 == 13) {
            class426.field6084 = 2;
            class260.field3845++;
            class209.field2989 = var9;
            class64.field886 = var8;
            class222.field3178 = 0;
            class407.field5761.method2048(arg0 + 2046, 126);
            class407.field5761.method856(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 - 1004744370);
            class407.field5761.method856(class342.field4959 + var3, -1004744376);
            class407.field5761.method835(7740, var2 + class306.field4459);
            class407.field5761.method816(-1640531527, class16.field247.method1758(-501, 82) ? 1 : 0);
            class299.method2018(var6, -21482, var3, var2);
        }
        if (var4 == 44 || var4 == 1008) {
            class382.method2432((byte) 61, var2, var5, arg1.field5418, var3);
        }
        if (var4 == 22) {
            class128 var26 = class243.field3596[var5];
            if (var26 != null) {
                class377.field5367++;
                class209.field2989 = var9;
                class426.field6084 = 2;
                class222.field3178 = 0;
                class64.field886 = var8;
                class407.field5761.method2048(2040, 112);
                class407.field5761.method849(class128.field1814, (byte) -104);
                class407.field5761.method856(var5, -1004744376);
                class407.field5761.method838(class16.field247.method1758(arg0 ^ 0x1F1, 82) ? 1 : 0, (byte) 93);
                class407.field5761.method840(255, class261.field3855);
                class452.method2815(class181.field2555.field4601[0], var26.field4595[0], var26.method773((byte) 27), class181.field2555.field4595[0], var26.method773((byte) 50), 0, true, (byte) -11, -2, 0, var26.field4601[0]);
            }
        }
        if (var4 == 18) {
            class223 var27 = class299.method2016(var2, var3, (byte) 117);
            if (var27 != null) {
                class63.method402(18002);
                class83 var28 = client.method1168(var27);
                class72.method438(var3, var2, var28.field1053, var27.field3236, var28.method488(arg0 ^ 0xFFFFFFF8), var27.field3302, (byte) -119);
                class285.field4153 = class170.method1218(var27, arg0 ^ 0xFFFFFFEF);
                class106.field1363 = var27.field3238 + "<col=ffffff>";
                if (class285.field4153 == null) {
                    class285.field4153 = "Null";
                }
            }
            return;
        }
        if (var4 == 20) {
            class128 var29 = class243.field3596[var5];
            if (var29 != null) {
                class426.field6084 = 2;
                class222.field3178 = 0;
                class64.field886 = var8;
                class23.field291++;
                class209.field2989 = var9;
                class407.field5761.method2048(2040, 144);
                class407.field5761.method835(arg0 + 7746, var5);
                class407.field5761.method831(class16.field247.method1758(-501, 82) ? 1 : 0, (byte) 126);
                class452.method2815(class181.field2555.field4601[0], var29.field4595[0], var29.method773((byte) 87), class181.field2555.field4595[0], var29.method773((byte) 80), 0, true, (byte) -11, -2, 0, var29.field4601[0]);
            }
        }
        if (class269.field3935) {
            class63.method402(18002);
        }
        if (class264.field3884 != null && class289.field4201 == 0) {
            class245.method1701(class264.field3884, (byte) -94);
        }
        if (arg0 != -6) {
            field1038 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I", line = 766)
    public final int method476(int arg0) {
        int var2 = 37 / ((58 - arg0) / 56);
        field1033++;
        return this.field1043;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIII)V", line = 782)
    public static final void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1032++;
        int var8 = class209.method1485(class240.field3547, 1667, class245.field3659, arg4);
        int var9 = class209.method1485(class240.field3547, 1667, class245.field3659, arg5);
        int var10 = class209.method1485(class231.field3415, 1667, class408.field5789, arg1);
        int var11 = class209.method1485(class231.field3415, 1667, class408.field5789, arg3);
        int var12 = class209.method1485(class240.field3547, 1667, class245.field3659, arg0 + arg4);
        int var13 = class209.method1485(class240.field3547, 1667, class245.field3659, arg5 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class5.method17(class440.field6288[var14], var11, arg7, (byte) 71, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class5.method17(class440.field6288[var15], var11, arg7, (byte) 90, var10);
        }
        int var16 = class209.method1485(class231.field3415, arg6 + 1667, class408.field5789, arg0 + arg1);
        if (arg6 != 0) {
            field1034 = -20;
        }
        int var17 = class209.method1485(class231.field3415, 1667, class408.field5789, arg3 - arg0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class440.field6288[var18];
            class5.method17(var19, var16, arg7, (byte) 106, var10);
            class5.method17(var19, var17, arg2, (byte) 122, var16);
            class5.method17(var19, var11, arg7, (byte) 117, var17);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLvo;)V", line = 835)
    public static final void method478(byte arg0, class28 arg1) {
        class266.field3911 = arg1;
        if (arg0 < -124) {
            field1030++;
        }
    }
}
