import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class637 {

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "Lim;")
    public static class353 field9250 = new class353(80, -1);

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "Lim;")
    public static class353 field9251 = new class353(56, -2);

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "[I")
    public static int[] field9252 = new int[4];

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILhda;)V")
    public static final void method3670(int arg0, int arg1, int arg2, class245 arg3) {
        field9249++;
        if (arg3 == null || class57.field760.field7933 == arg3) {
            return;
        }
        int var4 = arg3.field3096;
        int var5 = arg3.field3097;
        if (arg0 != 1) {
            return;
        }
        int var6 = arg3.field3094;
        int var7 = (int) arg3.field3099;
        long var8 = arg3.field3099;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 13) {
            class20 var10 = class364.field5092[var7];
            if (var10 != null) {
                class285.field3720 = arg2;
                class237.field3044 = 2;
                class409.field5609 = 0;
                class330.field4569 = arg1;
                class201.field2633++;
                class118.method650(true, class634.field9220);
                class272.field3457.method3082(var7, 128);
                class272.field3457.method3080(-92, class634.field9227.method2004((byte) -105, 82) ? 1 : 0);
                class18.method84(var10.field419[0], 0, 0, var10.method104((byte) -92), var10.field417[0], var10.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 5) {
            class20 var11 = class364.field5092[var7];
            if (var11 != null) {
                class641.field9316++;
                class237.field3044 = 2;
                class285.field3720 = arg2;
                class330.field4569 = arg1;
                class409.field5609 = 0;
                class118.method650(true, class268.field3421);
                class272.field3457.method3044(121, class167.field2109);
                class272.field3457.method3082(var7, 128);
                class272.field3457.method3054(class201.field2637, -122);
                class272.field3457.method3080(-84, class634.field9227.method2004((byte) -47, 82) ? 1 : 0);
                class272.field3457.method3044(96, class476.field6707);
                class18.method84(var11.field419[0], 0, 0, var11.method104((byte) -92), var11.field417[0], var11.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 46) {
            class409.field5609 = 0;
            class285.field3720 = arg2;
            class222.field2845++;
            class330.field4569 = arg1;
            class237.field3044 = 2;
            class118.method650(true, class334.field4663);
            class272.field3457.method3073(class58.field786 + var5, arg0 + -21078);
            class272.field3457.method3042((int) (var8 >>> 32) & Integer.MAX_VALUE, arg0 + 112);
            class272.field3457.method3060(class634.field9227.method2004((byte) -23, 82) ? 1 : 0, -25098);
            class272.field3457.method3082(class525.field7310 + var4, 128);
            class538.method2989(var5, var8, var4, (byte) 122);
        }
        if (var6 == 58) {
            class192.field2487++;
            class409.field5609 = 0;
            class285.field3720 = arg2;
            class237.field3044 = 2;
            class330.field4569 = arg1;
            class118.method650(true, class380.field5314);
            class272.field3457.method3073(class525.field7310 + var4, -21077);
            class272.field3457.method3042(class58.field786 + var5, 114);
            class272.field3457.method3044(40, var7);
            class272.field3457.method3060(class634.field9227.method2004((byte) -62, 82) ? 1 : 0, -25098);
            class276.method1705(true, var4, var5);
        }
        if (var6 == 18 || var6 == 1009) {
            class362.method2244(var7, var4, var5, -106, arg3.field3093);
        }
        if (var6 == 1011) {
            class285.field3720 = arg2;
            class567.field7927++;
            class409.field5609 = 0;
            class237.field3044 = 2;
            class330.field4569 = arg1;
            class118.method650(true, class463.field6594);
            class272.field3457.method3082(class58.field786 + var5, 128);
            class272.field3457.method3073(Integer.MAX_VALUE & (int) (var8 >>> 32), -21077);
            class272.field3457.method3061(arg0 + 5326, class634.field9227.method2004((byte) 115, 82) ? 1 : 0);
            class272.field3457.method3042(class525.field7310 + var4, -61);
            class538.method2989(var5, var8, var4, (byte) 121);
        }
        if (var6 == 4) {
            class447 var12 = class433.method2525(var4, var5, (byte) -112);
            if (var12 != null) {
                class606.method3471(93);
                class493 var13 = client.method3572(var12);
                class234.method1478(var13.field6884, var13.method2768(19270), var12, (byte) 108);
                class88.field1171 = class522.method2919(var12, (byte) -81);
                if (class88.field1171 == null) {
                    class88.field1171 = "Null";
                }
                class126.field1571 = var12.field6213 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 59) {
            class20 var14 = class364.field5092[var7];
            if (var14 != null) {
                class330.field4569 = arg1;
                class409.field5609 = 0;
                class33.field494++;
                class285.field3720 = arg2;
                class237.field3044 = 2;
                class118.method650(true, class254.field3156);
                class272.field3457.method3082(var7, 128);
                class272.field3457.method3080(-101, class634.field9227.method2004((byte) 115, 82) ? 1 : 0);
                class18.method84(var14.field419[0], 0, 0, var14.method104((byte) -92), var14.field417[0], var14.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 1006) {
            class330.field4569 = arg1;
            class285.field3720 = arg2;
            class237.field3044 = 2;
            class409.field5609 = 0;
            class480 var15 = (class480) class131.field1619.method3476((long) var7, (byte) 28);
            if (var15 != null) {
                class585 var16 = var15.field6729;
                class626 var17 = var16.field8478;
                if (var17.field9085 != null) {
                    var17 = var17.method3607(false, class257.field3191);
                }
                if (var17 != null) {
                    class118.method650(true, class526.field7324);
                    class434.field5900++;
                    class272.field3457.method3042(var17.field9096, 125);
                }
            }
        }
        if (var6 == 49) {
            class409.field5609 = 0;
            class237.field3044 = 2;
            class330.field4569 = arg1;
            class285.field3720 = arg2;
            class139.field1761++;
            class118.method650(true, class504.field7012);
            class272.field3457.method3080(-122, class634.field9227.method2004((byte) -51, 82) ? 1 : 0);
            class272.field3457.method3044(arg0 + 117, class525.field7310 + var4);
            class272.field3457.method3073(class58.field786 + var5, arg0 + -21078);
            class272.field3457.method3042(var7, -123);
            class276.method1705(true, var4, var5);
        }
        if (var6 == 51) {
            class20 var18 = class364.field5092[var7];
            if (var18 != null) {
                class285.field3720 = arg2;
                class409.field5609 = 0;
                class237.field3044 = 2;
                class368.field5129++;
                class330.field4569 = arg1;
                class118.method650(true, class335.field4684);
                class272.field3457.method3080(-83, class634.field9227.method2004((byte) -42, 82) ? 1 : 0);
                class272.field3457.method3044(65, var7);
                class18.method84(var18.field419[0], 0, 0, var18.method104((byte) -92), var18.field417[0], var18.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 3 && class168.field2123 == null) {
            class535.method2979(var5, var4, 0);
            class168.field2123 = class433.method2525(var4, var5, (byte) -125);
            class90.method501(class168.field2123, -1);
        }
        if (var6 == 44) {
            class20 var19 = class364.field5092[var7];
            if (var19 != null) {
                class118.field1490++;
                class285.field3720 = arg2;
                class237.field3044 = 2;
                class330.field4569 = arg1;
                class409.field5609 = 0;
                class118.method650(true, class640.field9276);
                class272.field3457.method3061(5327, class634.field9227.method2004((byte) -38, 82) ? 1 : 0);
                class272.field3457.method3044(40, var7);
                class18.method84(var19.field419[0], 0, 0, var19.method104((byte) -92), var19.field417[0], var19.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 1004) {
            class285.field3720 = arg2;
            class4.field42++;
            class237.field3044 = 2;
            class409.field5609 = 0;
            class330.field4569 = arg1;
            class118.method650(true, class414.field5699);
            class272.field3457.method3042(var7, -97);
        }
        if (var6 == 8) {
            class480 var20 = (class480) class131.field1619.method3476((long) var7, (byte) 28);
            if (var20 != null) {
                class585 var21 = var20.field6729;
                class330.field4569 = arg1;
                class237.field3044 = 2;
                class409.field5609 = 0;
                class285.field3720 = arg2;
                class288.field3761++;
                class118.method650(true, class108.field1405);
                class272.field3457.method3082(var7, arg0 + 127);
                class272.field3457.method3071(-38, class201.field2637);
                class272.field3457.method3042(class476.field6707, -53);
                class272.field3457.method3042(class167.field2109, arg0 - 100);
                class272.field3457.method3060(class634.field9227.method2004((byte) 115, 82) ? 1 : 0, arg0 - 25099);
                class18.method84(var21.field419[0], 0, 0, var21.method104((byte) -92), var21.field417[0], var21.method104((byte) -92), arg0 - 1, -2, true);
            }
        }
        if (var6 == 10) {
            class330.field4569 = arg1;
            class237.field3044 = 2;
            class285.field3720 = arg2;
            class409.field5609 = 0;
            class588.field8517++;
            class118.method650(true, class440.field5992);
            class272.field3457.method3061(arg0 ^ 0x14CE, class634.field9227.method2004((byte) -91, 82) ? 1 : 0);
            class272.field3457.method3044(37, class58.field786 + var5);
            class272.field3457.method3071(arg0 ^ 0xFFFFFF9A, class201.field2637);
            class272.field3457.method3044(76, var7);
            class272.field3457.method3044(arg0 + 90, var4 - -class525.field7310);
            class272.field3457.method3082(class476.field6707, 128);
            class272.field3457.method3044(106, class167.field2109);
            class276.method1705(true, var4, var5);
        }
        if (var6 == 19) {
            class20 var22 = class364.field5092[var7];
            if (var22 != null) {
                class313.field4046++;
                class409.field5609 = 0;
                class330.field4569 = arg1;
                class285.field3720 = arg2;
                class237.field3044 = 2;
                class118.method650(true, class318.field4388);
                class272.field3457.method3082(var7, arg0 ^ 0x81);
                class272.field3457.method3060(class634.field9227.method2004((byte) 103, 82) ? 1 : 0, -25098);
                class18.method84(var22.field419[0], 0, 0, var22.method104((byte) -92), var22.field417[0], var22.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 20) {
            class480 var23 = (class480) class131.field1619.method3476((long) var7, (byte) 28);
            if (var23 != null) {
                class409.field5609 = 0;
                class585 var24 = var23.field6729;
                class237.field3044 = 2;
                class285.field3720 = arg2;
                class564.field7914++;
                class330.field4569 = arg1;
                class118.method650(true, class543.field7578);
                class272.field3457.method3082(var7, 128);
                class272.field3457.method3080(-75, class634.field9227.method2004((byte) 112, 82) ? 1 : 0);
                class18.method84(var24.field419[0], 0, 0, var24.method104((byte) -92), var24.field417[0], var24.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 6) {
            class480 var25 = (class480) class131.field1619.method3476((long) var7, (byte) 28);
            if (var25 != null) {
                class585 var26 = var25.field6729;
                class237.field3044 = 2;
                class113.field1460++;
                class330.field4569 = arg1;
                class409.field5609 = 0;
                class285.field3720 = arg2;
                class118.method650(true, class235.field3011);
                class272.field3457.method3073(var7, -21077);
                class272.field3457.method3061(5327, class634.field9227.method2004((byte) -16, 82) ? 1 : 0);
                class18.method84(var26.field419[0], 0, 0, var26.method104((byte) -92), var26.field417[0], var26.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 60) {
            class237.field3044 = 2;
            class641.field9316++;
            class409.field5609 = 0;
            class285.field3720 = arg2;
            class330.field4569 = arg1;
            class118.method650(true, class268.field3421);
            class272.field3457.method3044(82, class167.field2109);
            class272.field3457.method3082(class147.field1899.field366, arg0 + 127);
            class272.field3457.method3054(class201.field2637, -110);
            class272.field3457.method3080(-73, class634.field9227.method2004((byte) 106, 82) ? 1 : 0);
            class272.field3457.method3044(94, class476.field6707);
        }
        if (var6 == 2) {
            class447 var27 = class433.method2525(var4, var5, (byte) -103);
            if (var27 != null) {
                class362.method2237((byte) 15, var27);
            }
        }
        if (var6 == 1010 || var6 == 1001 || var6 == 1003 || var6 == 1008 || var6 == 1002) {
            class119.method652(var7, var6, arg0 ^ 0xFFFFFF88, var4);
        }
        if (var6 == 48) {
            class20 var28 = class364.field5092[var7];
            if (var28 != null) {
                class237.field3044 = 2;
                class285.field3720 = arg2;
                class330.field4569 = arg1;
                class18.field201++;
                class409.field5609 = 0;
                class118.method650(true, class15.field157);
                class272.field3457.method3082(var7, arg0 + 127);
                class272.field3457.method3061(5327, class634.field9227.method2004((byte) -123, 82) ? 1 : 0);
                class18.method84(var28.field419[0], 0, 0, var28.method104((byte) -92), var28.field417[0], var28.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 15) {
            class82.field1110++;
            class409.field5609 = 0;
            class330.field4569 = arg1;
            class285.field3720 = arg2;
            class237.field3044 = 2;
            class118.method650(true, class227.field2897);
            class272.field3457.method3082(class58.field786 + var5, 128);
            class272.field3457.method3042((int) (var8 >>> 32) & Integer.MAX_VALUE, -94);
            class272.field3457.method3044(84, class525.field7310 + var4);
            class272.field3457.method3061(5327, class634.field9227.method2004((byte) -101, 82) ? 1 : 0);
            class538.method2989(var5, var8, var4, (byte) 66);
        }
        if (var6 == 25) {
            class20 var29 = class364.field5092[var7];
            if (var29 != null) {
                class237.field3044 = 2;
                class110.field1423++;
                class330.field4569 = arg1;
                class285.field3720 = arg2;
                class409.field5609 = 0;
                class118.method650(true, class30.field477);
                class272.field3457.method3060(class634.field9227.method2004((byte) -6, 82) ? 1 : 0, -25098);
                class272.field3457.method3082(var7, 128);
                class18.method84(var29.field419[0], 0, 0, var29.method104((byte) -92), var29.field417[0], var29.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 22) {
            class330.field4569 = arg1;
            class237.field3044 = 2;
            class409.field5609 = 0;
            class285.field3720 = arg2;
            class222.field2844++;
            class118.method650(true, class321.field4441);
            class272.field3457.method3060(class634.field9227.method2004((byte) -24, 82) ? 1 : 0, -25098);
            class272.field3457.method3044(111, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class272.field3457.method3082(class58.field786 + var5, 128);
            class272.field3457.method3082(class476.field6707, 128);
            class272.field3457.method3089(class201.field2637, arg0 ^ 0x758E6F89);
            class272.field3457.method3082(class525.field7310 + var4, 128);
            class272.field3457.method3073(class167.field2109, -21077);
            class538.method2989(var5, var8, var4, (byte) 74);
        }
        if (var6 == 45) {
            class20 var30 = class364.field5092[var7];
            if (var30 != null) {
                class237.field3044 = 2;
                class264.field3371++;
                class330.field4569 = arg1;
                class285.field3720 = arg2;
                class409.field5609 = 0;
                class118.method650(true, class206.field2682);
                class272.field3457.method3042(var7, -22);
                class272.field3457.method3075(class634.field9227.method2004((byte) 121, 82) ? 1 : 0, arg0 ^ 0x78);
                class18.method84(var30.field419[0], 0, 0, var30.method104((byte) -92), var30.field417[0], var30.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 12) {
            class10.field93++;
            class237.field3044 = 2;
            class409.field5609 = 0;
            class330.field4569 = arg1;
            class285.field3720 = arg2;
            class118.method650(true, class645.field9342);
            class272.field3457.method3042(class525.field7310 + var4, 124);
            class272.field3457.method3060(class634.field9227.method2004((byte) 102, 82) ? 1 : 0, arg0 - 25099);
            class272.field3457.method3044(112, class58.field786 + var5);
            class272.field3457.method3073(Integer.MAX_VALUE & (int) (var8 >>> 32), -21077);
            class538.method2989(var5, var8, var4, (byte) 90);
        }
        if (var6 == 16) {
            class480 var31 = (class480) class131.field1619.method3476((long) var7, (byte) 28);
            if (var31 != null) {
                class227.field2900++;
                class585 var32 = var31.field6729;
                class330.field4569 = arg1;
                class409.field5609 = 0;
                class237.field3044 = 2;
                class285.field3720 = arg2;
                class118.method650(true, class333.field4614);
                class272.field3457.method3080(-88, class634.field9227.method2004((byte) -25, 82) ? 1 : 0);
                class272.field3457.method3044(100, var7);
                class18.method84(var32.field419[0], 0, 0, var32.method104((byte) -92), var32.field417[0], var32.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 17) {
            class409.field5609 = 0;
            class237.field3044 = 2;
            class330.field4569 = arg1;
            class285.field3720 = arg2;
            class497.field6931++;
            class118.method650(true, class339.field4728);
            class272.field3457.method3080(-124, class634.field9227.method2004((byte) -65, 82) ? 1 : 0);
            class272.field3457.method3082(var7, arg0 ^ 0x81);
            class272.field3457.method3082(class58.field786 + var5, arg0 ^ 0x81);
            class272.field3457.method3042(var4 + class525.field7310, 124);
            class276.method1705(true, var4, var5);
        }
        if (var6 == 11) {
            class237.field3044 = 2;
            class285.field3720 = arg2;
            class409.field5609 = 0;
            class330.field4569 = arg1;
            class515.field7153++;
            class118.method650(true, class196.field2559);
            class272.field3457.method3082(var5 + class58.field786, 128);
            class272.field3457.method3060(class634.field9227.method2004((byte) -104, 82) ? 1 : 0, -25098);
            class272.field3457.method3073(var7, -21077);
            class272.field3457.method3082(class525.field7310 + var4, 128);
            class276.method1705(true, var4, var5);
        }
        if (var6 == 21) {
            class480 var33 = (class480) class131.field1619.method3476((long) var7, (byte) 28);
            if (var33 != null) {
                class18.field204++;
                class285.field3720 = arg2;
                class237.field3044 = 2;
                class409.field5609 = 0;
                class585 var34 = var33.field6729;
                class330.field4569 = arg1;
                class118.method650(true, class74.field1018);
                class272.field3457.method3044(80, var7);
                class272.field3457.method3080(-62, class634.field9227.method2004((byte) 125, 82) ? 1 : 0);
                class18.method84(var34.field419[0], 0, 0, var34.method104((byte) -92), var34.field417[0], var34.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 9) {
            class480 var35 = (class480) class131.field1619.method3476((long) var7, (byte) 28);
            if (var35 != null) {
                class409.field5609 = 0;
                class99.field1327++;
                class237.field3044 = 2;
                class330.field4569 = arg1;
                class585 var36 = var35.field6729;
                class285.field3720 = arg2;
                class118.method650(true, class199.field2599);
                class272.field3457.method3061(arg0 + 5326, class634.field9227.method2004((byte) -104, 82) ? 1 : 0);
                class272.field3457.method3073(var7, -21077);
                class18.method84(var36.field419[0], 0, 0, var36.method104((byte) -92), var36.field417[0], var36.method104((byte) -92), 0, -2, true);
            }
        }
        if (var6 == 57) {
            class285.field3720 = arg2;
            class144.field1856++;
            class330.field4569 = arg1;
            class237.field3044 = 2;
            class409.field5609 = 0;
            class118.method650(true, class174.field2250);
            class272.field3457.method3061(5327, class634.field9227.method2004((byte) 94, 82) ? 1 : 0);
            class272.field3457.method3044(66, var7);
            class272.field3457.method3044(71, var5 + class58.field786);
            class272.field3457.method3042(class525.field7310 + var4, 123);
            class276.method1705(true, var4, var5);
        }
        if (var6 == 1012) {
            class409.field5609 = 0;
            class330.field4569 = arg1;
            class237.field3044 = 2;
            class103.field1349++;
            class285.field3720 = arg2;
            class118.method650(true, class215.field2762);
            class272.field3457.method3042(var7, 121);
        }
        if (var6 == 30) {
            class237.field3044 = 1;
            class409.field5609 = 0;
            class285.field3720 = arg2;
            class330.field4569 = arg1;
            class257.field3190++;
            class118.method650(true, class542.field7576);
            class272.field3457.method3044(99, class525.field7310 + var4);
            class272.field3457.method3044(85, class167.field2109);
            class272.field3457.method3042(class476.field6707, arg0 + 120);
            class272.field3457.method3042(class58.field786 + var5, -105);
            class272.field3457.method3092(class201.field2637, -119);
            class18.method84(var4, 0, 0, 1, var5, 1, 0, -4, true);
        }
        if (var6 == 47) {
            if (class615.field8876 > 0 && class634.field9227.method2004((byte) -47, 82) && class634.field9227.method2004((byte) 116, 81)) {
                class141.method761(class525.field7310 + var4, class58.field786 + var5, arg0 ^ 0x51, class147.field1899.field6358);
            } else {
                class285.field3720 = arg2;
                class330.field4569 = arg1;
                class409.field5609 = 0;
                class151.field1990++;
                class237.field3044 = 1;
                class118.method650(true, class162.field2063);
                class272.field3457.method3082(class525.field7310 + var4, 128);
                class272.field3457.method3044(65, class58.field786 + var5);
            }
        }
        if (var6 == 50) {
            if (class615.field8876 > 0 && class634.field9227.method2004((byte) 81, 82) && class634.field9227.method2004((byte) 118, 81)) {
                class141.method761(class525.field7310 + var4, class58.field786 + var5, arg0 ^ 0xFFFFFFA8, class147.field1899.field6358);
            } else {
                class634.method3666(64, var7, var5, var4);
                if (var7 == 1) {
                    class272.field3457.method3060(-1, -25098);
                    class272.field3457.method3060(-1, -25098);
                    class272.field3457.method3042((int) class521.field7250, arg0 + 126);
                    class272.field3457.method3060(57, -25098);
                    class272.field3457.method3060(class374.field5212, arg0 - 25099);
                    class272.field3457.method3060(class54.field728, -25098);
                    class272.field3457.method3060(89, arg0 ^ 0xFFFF9DF7);
                    class272.field3457.method3042(class147.field1899.field6362, arg0 - 21);
                    class272.field3457.method3042(class147.field1899.field6368, arg0 ^ 0x74);
                    class272.field3457.method3060(63, -25098);
                } else {
                    class237.field3044 = 1;
                    class330.field4569 = arg1;
                    class285.field3720 = arg2;
                    class409.field5609 = 0;
                }
                class18.method84(var4, 0, 0, 1, var5, 1, 0, -4, true);
            }
        }
        if (var6 == 23) {
            class237.field3044 = 2;
            class409.field5609 = 0;
            class285.field3720 = arg2;
            class110.field1427++;
            class330.field4569 = arg1;
            class118.method650(true, class140.field1783);
            class272.field3457.method3042((int) (var8 >>> 32) & Integer.MAX_VALUE, -75);
            class272.field3457.method3042(class58.field786 + var5, arg0 ^ 0x7F);
            class272.field3457.method3080(arg0 - 59, class634.field9227.method2004((byte) 127, 82) ? 1 : 0);
            class272.field3457.method3042(var4 + class525.field7310, -54);
            class538.method2989(var5, var8, var4, (byte) 116);
        }
        if (class280.field3669) {
            class606.method3471(119);
        }
        if (class273.field3465 != null && class580.field8073 == 0) {
            class90.method501(class273.field3465, arg0 - 2);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)I")
    public static final int method3671(boolean arg0) {
        if (!arg0) {
            field9250 = null;
        }
        field9253++;
        return 2;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method3672(byte arg0) {
        field9250 = null;
        field9252 = null;
        field9251 = null;
        int var1 = -65 / ((55 - arg0) / 43);
    }
}
