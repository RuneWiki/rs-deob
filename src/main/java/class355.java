import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class355 {

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "Z")
    public boolean field4795 = false;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lsh;")
    public class49 field4789;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method2073(int arg0) {
        if (arg0 == 0) {
            field4801++;
            return this.field4789.field758.method2721(this.field4791, (byte) 118);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILjs;)I", line = 17)
    public static final int method2074(boolean arg0, int arg1, class216 arg2) {
        field4794++;
        return arg0 ? -64 : -1;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILmk;)V", line = 31)
    public static final void method2075(int arg0, int arg1, int arg2, class39 arg3) {
        field4792++;
        if (arg3 == null || class415.field5733.field3684 == arg3) {
            return;
        }
        int var4 = arg3.field598;
        int var5 = arg3.field600;
        if (arg1 != 82) {
            return;
        }
        int var6 = arg3.field590;
        int var7 = (int) arg3.field596;
        long var8 = arg3.field596;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 25) {
            class499.field6898++;
            class39.field593 = 2;
            class485.field6758 = arg0;
            class255.field3373 = arg2;
            class506.field7033 = 0;
            class118.method822(-76, class434.field5956);
            class193.field2708.method2188((int) (var8 >>> 32) & Integer.MAX_VALUE, arg1 ^ 0x2D);
            class193.field2708.method2241(0, class401.field5382 + var4);
            class193.field2708.method2198(var5 + class421.field5762, (byte) -23);
            class193.field2708.method2229((byte) 106, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class354.method2067(var8, var5, -18534, var4);
        }
        if (var6 == 20) {
            class255.field3373 = arg2;
            class66.field1019++;
            class485.field6758 = arg0;
            class506.field7033 = 0;
            class39.field593 = 2;
            class118.method822(-70, class379.field5168);
            class193.field2708.method2246(var7, (byte) -66);
            class193.field2708.method2209(5484, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2241(0, var4 + class401.field5382);
            class193.field2708.method2188(var5 + class421.field5762, arg1 + 39);
            class168.method1127(var4, var5, false);
        }
        if (var6 == 50) {
            class255.field3373 = arg2;
            class14.field280++;
            class506.field7033 = 0;
            class39.field593 = 2;
            class485.field6758 = arg0;
            class118.method822(-113, class327.field4321);
            class193.field2708.method2241(0, class421.field5762 + var5);
            class193.field2708.method2229((byte) 105, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2246(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -104);
            class193.field2708.method2188(class401.field5382 + var4, 119);
            class354.method2067(var8, var5, arg1 ^ 0xFFFFB7C8, var4);
        }
        if (var6 == 60) {
            class515 var10 = class499.field6901[var7];
            if (var10 != null) {
                class506.field7033 = 0;
                class485.field6758 = arg0;
                class191.field2692++;
                class255.field3373 = arg2;
                class39.field593 = 2;
                class118.method822(94, class291.field3821);
                class193.field2708.method2209(5484, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2246(var7, (byte) -50);
                class279.method1654(-2, arg1 - 83, var10.method2590(arg1 + -82), var10.field6266[0], 0, var10.method2590(0), true, var10.field6261[0], 0);
            }
        }
        if (var6 == 59) {
            class191.field2689++;
            class255.field3373 = arg2;
            class39.field593 = 2;
            class485.field6758 = arg0;
            class506.field7033 = 0;
            class118.method822(73, class265.field3503);
            class193.field2708.method2198(var4 + class401.field5382, (byte) -23);
            class193.field2708.method2246(var5 + class421.field5762, (byte) -102);
            class193.field2708.method2200(7, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2241(0, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class354.method2067(var8, var5, -18534, var4);
        }
        if (var6 == 5) {
            class117 var11 = class291.field3822[var7];
            if (var11 != null) {
                class39.field593 = 2;
                class506.field7033 = 0;
                class99.field1485++;
                class485.field6758 = arg0;
                class255.field3373 = arg2;
                class118.method822(arg1 - 34, class381.field5203);
                class193.field2708.method2229((byte) 95, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2246(var7, (byte) -67);
                class279.method1654(-2, -1, var11.method2590(0), var11.field6266[0], 0, var11.method2590(0), true, var11.field6261[0], 0);
            }
        }
        if (var6 == 51) {
            class39.field593 = 2;
            class255.field3373 = arg2;
            class278.field3645++;
            class506.field7033 = 0;
            class485.field6758 = arg0;
            class118.method822(arg1 ^ 0xFFFFFFF2, class283.field3712);
            class193.field2708.method2241(0, var7);
            class193.field2708.method2229((byte) 86, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2186(class196.field2749, arg1 - 32850);
            class193.field2708.method2246(class421.field5762 + var5, (byte) -115);
            class193.field2708.method2188(var4 + class401.field5382, 114);
            class193.field2708.method2246(class246.field3275, (byte) -80);
            class193.field2708.method2241(arg1 ^ 0x52, class94.field1415);
            class168.method1127(var4, var5, false);
        }
        if (var6 == 16) {
            class506.field7033 = 0;
            class152.field2202++;
            class255.field3373 = arg2;
            class485.field6758 = arg0;
            class39.field593 = 2;
            class118.method822(76, class347.field4684);
            class193.field2708.method2246(class421.field5762 + var5, (byte) -93);
            class193.field2708.method2198(var4 + class401.field5382, (byte) -23);
            class193.field2708.method2209(arg1 + 5402, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2241(arg1 ^ 0x52, var7);
            class168.method1127(var4, var5, false);
        }
        if (var6 == 48) {
            class117 var12 = class291.field3822[var7];
            if (var12 != null) {
                class255.field3373 = arg2;
                class506.field7033 = 0;
                class485.field6758 = arg0;
                class110.field1585++;
                class39.field593 = 2;
                class118.method822(127, class123.field1811);
                class193.field2708.method2246(var7, (byte) -80);
                class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, 1937490080);
                class279.method1654(-2, arg1 ^ -83, var12.method2590(arg1 - 82), var12.field6266[0], 0, var12.method2590(0), true, var12.field6261[0], 0);
            }
        }
        if (var6 == 17) {
            class515 var13 = class499.field6901[var7];
            if (var13 != null) {
                class39.field593 = 2;
                class310.field4083++;
                class485.field6758 = arg0;
                class506.field7033 = 0;
                class255.field3373 = arg2;
                class118.method822(72, class200.field2777);
                class193.field2708.method2229((byte) 93, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2188(var7, 116);
                class279.method1654(-2, arg1 - 83, var13.method2590(0), var13.field6266[0], 0, var13.method2590(0), true, var13.field6261[0], 0);
            }
        }
        if (var6 == 13) {
            class117 var14 = class291.field3822[var7];
            if (var14 != null) {
                class506.field7033 = 0;
                class485.field6758 = arg0;
                class255.field3373 = arg2;
                class200.field2778++;
                class39.field593 = 2;
                class118.method822(-72, class364.field4934);
                class193.field2708.method2198(var7, (byte) -23);
                class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, 1937490080);
                class279.method1654(-2, -1, var14.method2590(0), var14.field6266[0], 0, var14.method2590(0), true, var14.field6261[0], 0);
            }
        }
        if (var6 == 2) {
            class39.field593 = 2;
            class189.field2656++;
            class255.field3373 = arg2;
            class506.field7033 = 0;
            class485.field6758 = arg0;
            class118.method822(115, class314.field4112);
            class193.field2708.method2241(arg1 - 82, var7);
            class193.field2708.method2188(var4 + class401.field5382, 122);
            class193.field2708.method2209(5484, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2188(var5 + class421.field5762, 118);
            class168.method1127(var4, var5, false);
        }
        if (var6 == 44) {
            class117 var15 = class291.field3822[var7];
            if (var15 != null) {
                class39.field593 = 2;
                class495.field6876++;
                class255.field3373 = arg2;
                class485.field6758 = arg0;
                class506.field7033 = 0;
                class118.method822(81, class78.field1166);
                class193.field2708.method2209(5484, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2246(var7, (byte) -124);
                class279.method1654(-2, -1, var15.method2590(0), var15.field6266[0], 0, var15.method2590(0), true, var15.field6261[0], 0);
            }
        }
        if (var6 == 45) {
            class515 var16 = class499.field6901[var7];
            if (var16 != null) {
                class29.field488++;
                class39.field593 = 2;
                class255.field3373 = arg2;
                class485.field6758 = arg0;
                class506.field7033 = 0;
                class118.method822(-119, class253.field3352);
                class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, arg1 + 1937489998);
                class193.field2708.method2198(var7, (byte) -23);
                class279.method1654(-2, arg1 ^ -83, var16.method2590(0), var16.field6266[0], 0, var16.method2590(arg1 - 82), true, var16.field6261[0], 0);
            }
        }
        if (var6 == 1009) {
            class39.field593 = 2;
            class255.field3373 = arg2;
            class485.field6758 = arg0;
            class506.field7033 = 0;
            class519.field7688++;
            class118.method822(70, class102.field1503);
            class193.field2708.method2246(var7, (byte) -62);
        }
        if (var6 == 15) {
            class515 var17 = class499.field6901[var7];
            if (var17 != null) {
                class255.field3373 = arg2;
                class319.field4180++;
                class485.field6758 = arg0;
                class39.field593 = 2;
                class506.field7033 = 0;
                class118.method822(110, class103.field1515);
                class193.field2708.method2229((byte) 109, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2198(var7, (byte) -23);
                class279.method1654(-2, -1, var17.method2590(0), var17.field6266[0], 0, var17.method2590(0), true, var17.field6261[0], 0);
            }
        }
        if (var6 == 23) {
            class515 var18 = class499.field6901[var7];
            if (var18 != null) {
                class506.field7033 = 0;
                class255.field3373 = arg2;
                class39.field593 = 2;
                class485.field6758 = arg0;
                class317.field4162++;
                class118.method822(-93, class367.field4964);
                class193.field2708.method2200(7, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2241(0, var7);
                class279.method1654(-2, -1, var18.method2590(0), var18.field6266[0], 0, var18.method2590(0), true, var18.field6261[0], 0);
            }
        }
        if (var6 == 12 || var6 == 1007) {
            class116.method796(var7, arg3.field594, 9, var5, var4);
        }
        if (var6 == 1003) {
            class39.field593 = 2;
            class309.field4058++;
            class255.field3373 = arg2;
            class506.field7033 = 0;
            class485.field6758 = arg0;
            class118.method822(arg1 + 8, class131.field1897);
            class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, 1937490080);
            class193.field2708.method2241(0, var5 + class421.field5762);
            class193.field2708.method2198(var4 + class401.field5382, (byte) -23);
            class193.field2708.method2198(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -23);
            class354.method2067(var8, var5, arg1 ^ 0xFFFFB7C8, var4);
        }
        if (var6 == 11) {
            class515 var19 = class499.field6901[var7];
            if (var19 != null) {
                class23.field394++;
                class506.field7033 = 0;
                class485.field6758 = arg0;
                class255.field3373 = arg2;
                class39.field593 = 2;
                class118.method822(71, class305.field4024);
                class193.field2708.method2246(var7, (byte) -62);
                class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, arg1 ^ 0x737BC0F2);
                class279.method1654(-2, -1, var19.method2590(0), var19.field6266[0], 0, var19.method2590(0), true, var19.field6261[0], 0);
            }
        }
        if (var6 == 22) {
            class39.field593 = 2;
            class485.field6758 = arg0;
            class477.field6571++;
            class506.field7033 = 0;
            class255.field3373 = arg2;
            class118.method822(-123, class343.field4534);
            class193.field2708.method2200(7, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2188(var5 + class421.field5762, 116);
            class193.field2708.method2198(class401.field5382 + var4, (byte) -23);
            class193.field2708.method2246(var7, (byte) -97);
            class168.method1127(var4, var5, false);
        }
        if (var6 == 21) {
            class117 var20 = class291.field3822[var7];
            if (var20 != null) {
                class255.field3373 = arg2;
                class39.field593 = 2;
                class485.field6758 = arg0;
                class506.field7033 = 0;
                class175.field2552++;
                class118.method822(arg1 ^ 0x7D, class50.field773);
                class193.field2708.method2188(var7, 120);
                class193.field2708.method2200(7, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class279.method1654(-2, -1, var20.method2590(0), var20.field6266[0], 0, var20.method2590(0), true, var20.field6261[0], 0);
            }
        }
        if (var6 == 58 && class71.field1072 == null) {
            class340.method1948(var5, var4, 8615);
            class71.field1072 = class381.method2261(-10673, var5, var4);
            class412.method2378(class71.field1072, (byte) -119);
        }
        if (var6 == 1012) {
            class255.field3373 = arg2;
            class506.field7033 = 0;
            class232.field3120++;
            class39.field593 = 2;
            class485.field6758 = arg0;
            class118.method822(85, class506.field7026);
            class193.field2708.method2246(var7, (byte) -51);
        }
        if (var6 == 4) {
            class117 var21 = class291.field3822[var7];
            if (var21 != null) {
                class255.field3373 = arg2;
                class485.field6758 = arg0;
                class39.field593 = 2;
                class145.field2062++;
                class506.field7033 = 0;
                class118.method822(122, class519.field7692);
                class193.field2708.method2229((byte) 100, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2227(class196.field2749, (byte) -127);
                class193.field2708.method2241(0, class246.field3275);
                class193.field2708.method2241(arg1 ^ 0x52, var7);
                class193.field2708.method2198(class94.field1415, (byte) -23);
                class279.method1654(-2, -1, var21.method2590(0), var21.field6266[0], 0, var21.method2590(0), true, var21.field6261[0], 0);
            }
        }
        if (var6 == 9) {
            if (class196.field2745 > 0 && class32.field523.method305(82, (byte) 59) && class32.field523.method305(81, (byte) 59)) {
                class268.method1611(class421.field5762 + var5, (byte) -123, class385.field5232.field573, class401.field5382 + var4);
            } else {
                class485.field6758 = arg0;
                class255.field3373 = arg2;
                class39.field593 = 1;
                class128.field1861++;
                class506.field7033 = 0;
                class118.method822(-127, class170.field2474);
                class193.field2708.method2241(0, class401.field5382 + var4);
                class193.field2708.method2241(0, class421.field5762 + var5);
            }
        }
        if (var6 == 18) {
            class506.field7033 = 0;
            class255.field3373 = arg2;
            class39.field593 = 2;
            class360.field4855++;
            class485.field6758 = arg0;
            class118.method822(41, class285.field3721);
            class193.field2708.method2241(0, class94.field1415);
            class193.field2708.method2229((byte) 110, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2227(class196.field2749, (byte) 45);
            class193.field2708.method2198(class246.field3275, (byte) -23);
            class193.field2708.method2188(class385.field5232.field6170, arg1 ^ 0x20);
        }
        if (var6 == 57) {
            class515 var22 = class499.field6901[var7];
            if (var22 != null) {
                class506.field7033 = 0;
                class255.field3373 = arg2;
                class39.field593 = 2;
                class360.field4855++;
                class485.field6758 = arg0;
                class118.method822(-122, class285.field3721);
                class193.field2708.method2241(0, class94.field1415);
                class193.field2708.method2229((byte) 106, class32.field523.method305(82, (byte) 59) ? 1 : 0);
                class193.field2708.method2227(class196.field2749, (byte) -24);
                class193.field2708.method2198(class246.field3275, (byte) -23);
                class193.field2708.method2188(var7, 116);
                class279.method1654(-2, -1, var22.method2590(arg1 - 82), var22.field6266[0], 0, var22.method2590(0), true, var22.field6261[0], 0);
            }
        }
        if (var6 == 30) {
            class39.field593 = 1;
            class485.field6758 = arg0;
            class255.field3373 = arg2;
            class506.field7033 = 0;
            class364.field4931++;
            class118.method822(73, class96.field1455);
            class193.field2708.method2241(0, class246.field3275);
            class193.field2708.method2246(class401.field5382 + var4, (byte) -100);
            class193.field2708.method2246(class421.field5762 + var5, (byte) -121);
            class193.field2708.method2186(class196.field2749, -32768);
            class193.field2708.method2198(class94.field1415, (byte) -23);
            class279.method1654(-4, -1, 1, var5, 0, 1, true, var4, 0);
        }
        if (var6 == 49) {
            class39.field593 = 2;
            class506.field7033 = 0;
            class485.field6758 = arg0;
            class352.field4763++;
            class255.field3373 = arg2;
            class118.method822(arg1 - 26, class53.field833);
            class193.field2708.method2186(class196.field2749, -32768);
            class193.field2708.method2246(class401.field5382 + var4, (byte) -127);
            class193.field2708.method2188(var5 + class421.field5762, arg1 ^ 0x2A);
            class193.field2708.method2209(arg1 + 5402, class32.field523.method305(82, (byte) 59) ? 1 : 0);
            class193.field2708.method2246((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -68);
            class193.field2708.method2246(class246.field3275, (byte) -105);
            class193.field2708.method2198(class94.field1415, (byte) -23);
            class354.method2067(var8, var5, -18534, var4);
        }
        if (var6 == 19) {
            class515 var23 = class499.field6901[var7];
            if (var23 != null) {
                class485.field6758 = arg0;
                class5.field141++;
                class255.field3373 = arg2;
                class506.field7033 = 0;
                class39.field593 = 2;
                class118.method822(arg1 - 190, class331.field4359);
                class193.field2708.method2198(var7, (byte) -23);
                class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, 1937490080);
                class279.method1654(-2, -1, var23.method2590(0), var23.field6266[0], 0, var23.method2590(0), true, var23.field6261[0], 0);
            }
        }
        if (var6 == 1004) {
            class506.field7033 = 0;
            class485.field6758 = arg0;
            class255.field3373 = arg2;
            class39.field593 = 2;
            class117 var24 = class291.field3822[var7];
            if (var24 != null) {
                class506 var25 = var24.field1661;
                if (var25.field6971 != null) {
                    var25 = var25.method2885(arg1 + 16, class301.field3980);
                }
                if (var25 != null) {
                    class125.field1844++;
                    class118.method822(-91, class433.field5936);
                    class193.field2708.method2246(var25.field6979, (byte) -127);
                }
            }
        }
        if (var6 == 1011 || var6 == 1002 || var6 == 1008 || var6 == 1001 || var6 == 1006) {
            class310.method1803(var6, var4, var7, (byte) -77);
        }
        if (var6 == 46) {
            class403 var26 = class381.method2261(-10673, var5, var4);
            if (var26 != null) {
                class407.method2367(arg1 - 12401, var26);
            }
        }
        if (var6 == 3) {
            class403 var27 = class381.method2261(-10673, var5, var4);
            if (var27 != null) {
                class506.method2892(65535);
                class350 var28 = client.method1255(var27);
                class63.method434(var27, var28.method2046((byte) -82), var28.field4718, 5465);
                class59.field925 = class228.method1420(-75, var27);
                if (class59.field925 == null) {
                    class59.field925 = "Null";
                }
                class455.field6214 = var27.field5544 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 47) {
            class485.field6758 = arg0;
            class255.field3373 = arg2;
            class506.field7033 = 0;
            class39.field593 = 2;
            class351.field4741++;
            class118.method822(43, class33.field535);
            class193.field2708.method2198(class421.field5762 + var5, (byte) -23);
            class193.field2708.method2241(0, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, 1937490080);
            class193.field2708.method2198(var4 + class401.field5382, (byte) -23);
            class354.method2067(var8, var5, -18534, var4);
        }
        if (var6 == 8) {
            class515 var29 = class499.field6901[var7];
            if (var29 != null) {
                class255.field3373 = arg2;
                class485.field6758 = arg0;
                class42.field625++;
                class39.field593 = 2;
                class506.field7033 = 0;
                class118.method822(-83, class266.field3511);
                class193.field2708.method2246(var7, (byte) -48);
                class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, 1937490080);
                class279.method1654(-2, -1, var29.method2590(0), var29.field6266[0], 0, var29.method2590(0), true, var29.field6261[0], 0);
            }
        }
        if (var6 == 10) {
            class506.field7033 = 0;
            class255.field3373 = arg2;
            class16.field284++;
            class485.field6758 = arg0;
            class39.field593 = 2;
            class118.method822(101, class477.field6576);
            class193.field2708.method2198(var4 + class401.field5382, (byte) -23);
            class193.field2708.method2241(0, var7);
            class193.field2708.method2241(arg1 - 82, class421.field5762 + var5);
            class193.field2708.method2239(class32.field523.method305(82, (byte) 59) ? 1 : 0, 1937490080);
            class168.method1127(var4, var5, false);
        }
        if (var6 == 6) {
            if (class196.field2745 > 0 && class32.field523.method305(82, (byte) 59) && class32.field523.method305(81, (byte) 59)) {
                class268.method1611(class421.field5762 + var5, (byte) -123, class385.field5232.field573, class401.field5382 + var4);
            } else {
                class423.method2435(var7, 12, var5, var4);
                if (var7 == 1) {
                    class193.field2708.method2200(7, -1);
                    class193.field2708.method2200(7, -1);
                    class193.field2708.method2246((int) class184.field2621, (byte) -58);
                    class193.field2708.method2200(7, 57);
                    class193.field2708.method2200(7, class361.field4871);
                    class193.field2708.method2200(7, class514.field7589);
                    class193.field2708.method2200(7, 89);
                    class193.field2708.method2246(class385.field5232.field584, (byte) -55);
                    class193.field2708.method2246(class385.field5232.field574, (byte) -115);
                    class193.field2708.method2200(7, 63);
                } else {
                    class39.field593 = 1;
                    class255.field3373 = arg2;
                    class485.field6758 = arg0;
                    class506.field7033 = 0;
                }
                class279.method1654(-4, arg1 ^ -83, 1, var5, 0, 1, true, var4, 0);
            }
        }
        if (class32.field529) {
            class506.method2892(65535);
        }
        if (class485.field6759 != null && class320.field4191 == 0) {
            class412.method2378(class485.field6759, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILqa;I)Lf;", line = 744)
    public final class529 method2076(boolean arg0, int arg1, class162 arg2, int arg3) {
        field4799++;
        long var5 = (long) ((arg0 ? 262144 : 0) | arg3 << 16 | this.field4791 | arg2.field2378 << 19);
        class529 var7 = (class529) this.field4789.field769.method1456(var5, arg1 ^ 0x75);
        if (var7 != null) {
            return var7;
        } else if (this.field4789.field758.method2721(this.field4791, (byte) 95)) {
            class134 var8 = class134.method939(this.field4789.field758, this.field4791, arg1);
            if (var8 != null) {
                var8.field1918 = var8.field1919 = var8.field1924 = var8.field1922 = 0;
                if (arg0) {
                    var8.method951();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method944();
                }
            }
            class529 var10 = arg2.method596(var8, true);
            if (var10 != null) {
                this.field4789.field769.method1462(var10, var5, -113);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILmd;)V", line = 787)
    public final void method2077(int arg0, class379 arg1) {
        while (true) {
            int var3 = arg1.method2238(255);
            if (var3 == 0) {
                if (arg0 != -29697) {
                    method2074(false, -12, null);
                }
                field4790++;
                return;
            }
            this.method2079(11240, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)Z", line = 812)
    public static final boolean method2078(int arg0) {
        if (arg0 > -35) {
            field4798 = -4;
        }
        field4796++;
        if (class223.field3009) {
            try {
                if ((Boolean) class87.method637(-59, class389.field5281.field2917, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILmd;I)V", line = 831)
    private final void method2079(int arg0, class379 arg1, int arg2) {
        field4793++;
        if (arg2 == 1) {
            this.field4791 = arg1.method2212((byte) 83);
        } else if (arg2 == 2) {
            this.field4797 = arg1.method2249((byte) 63);
        } else if (arg2 == 3) {
            this.field4795 = true;
        } else if (arg2 == 4) {
            this.field4791 = -1;
        }
        if (arg0 != 11240) {
            this.method2077(-107, null);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Z", line = 861)
    public static final boolean method2080(int arg0, int arg1) {
        field4800++;
        if (arg0 >= -33) {
            field4798 = 66;
        }
        return arg1 == 12 || arg1 == 46 || arg1 == 1007 || arg1 == 3 || arg1 == 58;
    }
}
