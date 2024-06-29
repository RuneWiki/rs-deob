import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class48 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "B")
    public byte field573;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "S")
    public short field572;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lap;")
    public class334 field571;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "B")
    public byte field577;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field574 = -50;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Z")
    public static boolean field570 = false;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILju;I)V")
    public static final void method426(int arg0, int arg1, class82 arg2, int arg3) {
        field576++;
        if (arg2 == null || class526.field7778.field6997 == arg2) {
            return;
        }
        int var4 = arg2.field1228;
        int var5 = arg2.field1233;
        int var6 = arg2.field1230;
        int var7 = (int) arg2.field1238;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg2.field1238;
        if (var6 == 3) {
            class283.field3875 = 0;
            class431.field6328++;
            class179.field2629 = arg1;
            class116.field1743 = arg0;
            class174.field2592 = 2;
            class491.method2878((byte) 92, class79.field1211);
            class481.field7027.method2307(var7, -1069935832);
            class481.field7027.method2360(32, class14.field204 + var5);
            class481.field7027.method2316(class310.field4231.method901(0, 82) ? 1 : 0, (byte) -82);
            class481.field7027.method2307(class510.field7566 + var4, -1069935832);
            class206.method1270(var4, var5, -122);
        }
        if (var6 == 5) {
            class502 var10 = class378.field5533[var7];
            if (var10 != null) {
                class179.field2629 = arg1;
                class174.field2592 = 2;
                class116.field1743 = arg0;
                class195.field2775++;
                class283.field3875 = 0;
                class491.method2878((byte) 92, class141.field2028);
                class481.field7027.method2342(-111, class310.field4231.method901(0, 82) ? 1 : 0);
                class481.field7027.method2307(var7, -1069935832);
                class506.method3020(0, 0, -2096, true, -2, var10.method626((byte) 120), var10.field1117[0], var10.method626((byte) 120), var10.field1127[0]);
            }
        }
        if (var6 == 48) {
            class174.field2592 = 2;
            class283.field3875 = 0;
            class116.field1743 = arg0;
            class52.field629++;
            class179.field2629 = arg1;
            class491.method2878((byte) 92, class231.field3267);
            class481.field7027.method2355(1686288168, class510.field7566 + var4);
            class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2355(1686288168, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class481.field7027.method2307(var5 + class14.field204, -1069935832);
            class388.method2289(var4, 114, var5, var8);
        }
        if (var6 == 45) {
            class467.field6844++;
            class179.field2629 = arg1;
            class283.field3875 = 0;
            class116.field1743 = arg0;
            class174.field2592 = 2;
            class491.method2878((byte) 92, class322.field4392);
            class481.field7027.method2360(32, class14.field204 + var5);
            class481.field7027.method2342(-84, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2307(Integer.MAX_VALUE & (int) (var8 >>> 32), -1069935832);
            class481.field7027.method2307(var4 + class510.field7566, -1069935832);
            class388.method2289(var4, 118, var5, var8);
        }
        if (var6 == 2) {
            class438 var11 = class12.field182[var7];
            if (var11 != null) {
                class116.field1743 = arg0;
                class174.field2592 = 2;
                class179.field2629 = arg1;
                class173.field2566++;
                class283.field3875 = 0;
                class491.method2878((byte) 92, class368.field5396);
                class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
                class481.field7027.method2307(var7, -1069935832);
                class506.method3020(0, 0, -2096, true, -2, var11.method626((byte) 120), var11.field1117[0], var11.method626((byte) 120), var11.field1127[0]);
            }
        }
        if (var6 == 16) {
            class438 var12 = class12.field182[var7];
            if (var12 != null) {
                class116.field1743 = arg0;
                class174.field2592 = 2;
                class247.field3428++;
                class179.field2629 = arg1;
                class283.field3875 = 0;
                class491.method2878((byte) 92, class294.field4049);
                class481.field7027.method2316(class310.field4231.method901(0, 82) ? 1 : 0, (byte) -97);
                class481.field7027.method2360(32, var7);
                class506.method3020(0, 0, -2096, true, -2, var12.method626((byte) 120), var12.field1117[0], var12.method626((byte) 120), var12.field1127[0]);
            }
        }
        if (var6 == 15) {
            class150 var13 = class525.method3121(var4, var5, -9140);
            if (var13 != null) {
                class88.method668((byte) -70);
                class188 var14 = client.method1228(var13);
                class26.method150(var13, -8605, var14.method1182((byte) 104), var14.field2720);
                class78.field1131 = class339.method2017(var13, 16776960);
                if (class78.field1131 == null) {
                    class78.field1131 = "Null";
                }
                class253.field3513 = var13.field2203 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 10) {
            class283.field3875 = 0;
            class116.field1743 = arg0;
            class179.field2629 = arg1;
            class413.field6035++;
            class174.field2592 = 2;
            class491.method2878((byte) 92, class136.field1955);
            class481.field7027.method2355(1686288168, class510.field7566 + var4);
            class481.field7027.method2351(class250.field3462, (byte) 81);
            class481.field7027.method2323(class14.field204 + var5, 111);
            class481.field7027.method2307(class214.field2994, -1069935832);
            class481.field7027.method2323(Integer.MAX_VALUE & (int) (var8 >>> 32), 30);
            class481.field7027.method2316(class310.field4231.method901(0, 82) ? 1 : 0, (byte) -50);
            class481.field7027.method2355(1686288168, class11.field171);
            class388.method2289(var4, 121, var5, var8);
        }
        if (var6 == 1012) {
            class174.field2592 = 2;
            class283.field3875 = 0;
            class179.field2629 = arg1;
            class116.field1743 = arg0;
            class502 var15 = class378.field5533[var7];
            if (var15 != null) {
                class79 var16 = var15.field7387;
                if (var16.field1143 != null) {
                    var16 = var16.method646(0, class421.field6166);
                }
                if (var16 != null) {
                    class491.method2878((byte) 92, class329.field4489);
                    class447.field6581++;
                    class481.field7027.method2355(1686288168, var16.field1146);
                }
            }
        }
        if (var6 == 60) {
            class502 var17 = class378.field5533[var7];
            if (var17 != null) {
                class174.field2592 = 2;
                class302.field4141++;
                class179.field2629 = arg1;
                class283.field3875 = 0;
                class116.field1743 = arg0;
                class491.method2878((byte) 92, class325.field4427);
                class481.field7027.method2342(-60, class310.field4231.method901(0, 82) ? 1 : 0);
                class481.field7027.method2355(1686288168, var7);
                class506.method3020(0, 0, -2096, true, -2, var17.method626((byte) 120), var17.field1117[0], var17.method626((byte) 120), var17.field1127[0]);
            }
        }
        if (var6 == 19) {
            class179.field2629 = arg1;
            class283.field3875 = 0;
            class174.field2592 = 2;
            class116.field1743 = arg0;
            class493.field7203++;
            class491.method2878((byte) 92, class228.field3240);
            class481.field7027.method2323(var5 + class14.field204, 88);
            class481.field7027.method2323(class510.field7566 + var4, 99);
            class481.field7027.method2360(32, var7);
            class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
            class206.method1270(var4, var5, -122);
        }
        if (var6 == 22) {
            class438 var18 = class12.field182[var7];
            if (var18 != null) {
                class20.field256++;
                class179.field2629 = arg1;
                class116.field1743 = arg0;
                class174.field2592 = 2;
                class283.field3875 = 0;
                class491.method2878((byte) 92, class389.field5661);
                class481.field7027.method2307(var7, -1069935832);
                class481.field7027.method2316(class310.field4231.method901(0, 82) ? 1 : 0, (byte) -61);
                class506.method3020(0, 0, -2096, true, -2, var18.method626((byte) 120), var18.field1117[0], var18.method626((byte) 120), var18.field1127[0]);
            }
        }
        if (var6 == 1007) {
            class283.field3875 = 0;
            class174.field2592 = 2;
            class424.field6208++;
            class116.field1743 = arg0;
            class179.field2629 = arg1;
            class491.method2878((byte) 92, class175.field2599);
            class481.field7027.method2355(1686288168, var7);
        }
        if (var6 == 9 || var6 == 1003) {
            class462.method2714(var5, arg2.field1240, -31433, var4, var7);
        }
        if (var6 == 58) {
            class179.field2629 = arg1;
            class116.field1743 = arg0;
            class283.field3875 = 0;
            class174.field2592 = 2;
            class125.field1860++;
            class491.method2878((byte) 92, class436.field6381);
            class481.field7027.method2355(1686288168, var5 + class14.field204);
            class481.field7027.method2307(class510.field7566 + var4, -1069935832);
            class481.field7027.method2312((byte) -84, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2323(Integer.MAX_VALUE & (int) (var8 >>> 32), 44);
            class388.method2289(var4, 106, var5, var8);
        }
        if (var6 == 59) {
            if (class68.field929 > 0 && class310.field4231.method901(0, 82) && class310.field4231.method901(0, 81)) {
                class422.method2513(class316.field4324.field1738, class510.field7566 + var4, class14.field204 - -var5, (byte) 127);
            } else {
                class284.method1690(var4, var7, (byte) -111, var5);
                if (var7 == 1) {
                    class481.field7027.method2302(-4, -1);
                    class481.field7027.method2302(-4, -1);
                    class481.field7027.method2355(1686288168, (int) class498.field7255);
                    class481.field7027.method2302(-4, 57);
                    class481.field7027.method2302(-4, class302.field4143);
                    class481.field7027.method2302(-4, class162.field2435);
                    class481.field7027.method2302(-4, 89);
                    class481.field7027.method2355(1686288168, class316.field4324.field1732);
                    class481.field7027.method2355(1686288168, class316.field4324.field1735);
                    class481.field7027.method2302(-4, 63);
                } else {
                    class179.field2629 = arg1;
                    class174.field2592 = 1;
                    class283.field3875 = 0;
                    class116.field1743 = arg0;
                }
                class506.method3020(0, 0, -2096, true, -4, 1, var5, 1, var4);
            }
        }
        if (var6 == 25) {
            class438 var19 = class12.field182[var7];
            if (var19 != null) {
                class174.field2592 = 2;
                class116.field1743 = arg0;
                class143.field2055++;
                class283.field3875 = 0;
                class179.field2629 = arg1;
                class491.method2878((byte) 92, class30.field396);
                class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
                class481.field7027.method2323(var7, 119);
                class506.method3020(0, 0, -2096, true, -2, var19.method626((byte) 120), var19.field1117[0], var19.method626((byte) 120), var19.field1127[0]);
            }
        }
        if (var6 == 11) {
            class502 var20 = class378.field5533[var7];
            if (var20 != null) {
                class174.field2592 = 2;
                class116.field1743 = arg0;
                class283.field3875 = 0;
                class473.field6907++;
                class179.field2629 = arg1;
                class491.method2878((byte) 92, class365.field5345);
                class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
                class481.field7027.method2360(32, var7);
                class506.method3020(0, 0, -2096, true, -2, var20.method626((byte) 120), var20.field1117[0], var20.method626((byte) 120), var20.field1127[0]);
            }
        }
        if (var6 == 49) {
            class438 var21 = class12.field182[var7];
            if (var21 != null) {
                class116.field1743 = arg0;
                class179.field2629 = arg1;
                class174.field2592 = 2;
                class5.field55++;
                class283.field3875 = 0;
                class491.method2878((byte) 92, class235.field3334);
                class481.field7027.method2307(var7, -1069935832);
                class481.field7027.method2342(88, class310.field4231.method901(0, 82) ? 1 : 0);
                class506.method3020(0, 0, -2096, true, -2, var21.method626((byte) 120), var21.field1117[0], var21.method626((byte) 120), var21.field1127[0]);
            }
        }
        if (var6 == 21) {
            class438 var22 = class12.field182[var7];
            if (var22 != null) {
                class174.field2592 = 2;
                class283.field3875 = 0;
                class116.field1743 = arg0;
                class251.field3472++;
                class179.field2629 = arg1;
                class491.method2878((byte) 92, class450.field6620);
                class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
                class481.field7027.method2355(1686288168, var7);
                class506.method3020(0, 0, -2096, true, -2, var22.method626((byte) 120), var22.field1117[0], var22.method626((byte) 120), var22.field1127[0]);
            }
        }
        if (var6 == 6) {
            class116.field1743 = arg0;
            class174.field2592 = 2;
            class283.field3875 = 0;
            class13.field197++;
            class179.field2629 = arg1;
            class491.method2878((byte) 92, class487.field7128);
            class481.field7027.method2323(class510.field7566 + var4, 63);
            class481.field7027.method2323(class14.field204 + var5, 82);
            class481.field7027.method2312((byte) -84, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2307(Integer.MAX_VALUE & (int) (var8 >>> 32), -1069935832);
            class388.method2289(var4, 124, var5, var8);
        }
        if (var6 == 20) {
            class179.field2629 = arg1;
            class116.field1743 = arg0;
            class283.field3875 = 0;
            class497.field7244++;
            class174.field2592 = 2;
            class491.method2878((byte) 92, class450.field6621);
            class481.field7027.method2323(var7, 109);
            class481.field7027.method2307(var5 + class14.field204, -1069935832);
            class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2360(32, var4 + class510.field7566);
            class206.method1270(var4, var5, -126);
        }
        if (var6 == 57) {
            class150 var23 = class525.method3121(var4, var5, -9140);
            if (var23 != null) {
                class24.method139(var23, false);
            }
        }
        if (var6 == 46) {
            class502 var24 = class378.field5533[var7];
            if (var24 != null) {
                class116.field1743 = arg0;
                class283.field3875 = 0;
                class174.field2592 = 2;
                class179.field2629 = arg1;
                class187.field2707++;
                class491.method2878((byte) 92, class70.field972);
                class481.field7027.method2307(var7, -1069935832);
                class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
                class506.method3020(0, 0, -2096, true, -2, var24.method626((byte) 120), var24.field1117[0], var24.method626((byte) 120), var24.field1127[0]);
            }
        }
        if (var6 == 12) {
            class438 var25 = class12.field182[var7];
            if (var25 != null) {
                class421.field6165++;
                class179.field2629 = arg1;
                class283.field3875 = 0;
                class116.field1743 = arg0;
                class174.field2592 = 2;
                class491.method2878((byte) 92, class74.field1004);
                class481.field7027.method2360(32, var7);
                class481.field7027.method2312((byte) -84, class310.field4231.method901(0, 82) ? 1 : 0);
                class481.field7027.method2323(class11.field171, 16);
                class481.field7027.method2331(class250.field3462, false);
                class481.field7027.method2323(class214.field2994, 21);
                class506.method3020(0, 0, -2096, true, -2, var25.method626((byte) 120), var25.field1117[0], var25.method626((byte) 120), var25.field1127[0]);
            }
        }
        if (var6 == 17) {
            class128.field1901++;
            class179.field2629 = arg1;
            class174.field2592 = 2;
            class116.field1743 = arg0;
            class283.field3875 = 0;
            class491.method2878((byte) 92, class79.field1198);
            class481.field7027.method2355(1686288168, var7);
            class481.field7027.method2307(var4 + class510.field7566, -1069935832);
            class481.field7027.method2342(84, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2360(32, class14.field204 + var5);
            class206.method1270(var4, var5, -115);
        }
        if (var6 == 1010 || var6 == 1008 || var6 == 1004 || var6 == 1009 || var6 == 1001) {
            class266.method1590(var4, -1, var6, var7);
        }
        if (var6 == 13) {
            class438 var26 = class12.field182[var7];
            if (var26 != null) {
                class116.field1743 = arg0;
                class228.field3235++;
                class174.field2592 = 2;
                class283.field3875 = 0;
                class179.field2629 = arg1;
                class491.method2878((byte) 92, class498.field7254);
                class481.field7027.method2307(var7, -1069935832);
                class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
                class506.method3020(0, 0, -2096, true, -2, var26.method626((byte) 120), var26.field1117[0], var26.method626((byte) 120), var26.field1127[0]);
            }
        }
        if (var6 == 1011) {
            class116.field1743 = arg0;
            class283.field3875 = 0;
            class68.field927++;
            class174.field2592 = 2;
            class179.field2629 = arg1;
            class491.method2878((byte) 92, class236.field3347);
            class481.field7027.method2307(var4 + class510.field7566, -1069935832);
            class481.field7027.method2360(32, var5 + class14.field204);
            class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2355(1686288168, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class388.method2289(var4, 106, var5, var8);
        }
        if (var6 == 47) {
            class438 var27 = class12.field182[var7];
            if (var27 != null) {
                class209.field2902++;
                class174.field2592 = 2;
                class116.field1743 = arg0;
                class179.field2629 = arg1;
                class283.field3875 = 0;
                class491.method2878((byte) 92, class80.field1221);
                class481.field7027.method2307(var7, -1069935832);
                class481.field7027.method2312((byte) -84, class310.field4231.method901(0, 82) ? 1 : 0);
                class506.method3020(0, 0, -2096, true, -2, var27.method626((byte) 120), var27.field1117[0], var27.method626((byte) 120), var27.field1127[0]);
            }
        }
        if (var6 == 1006) {
            class174.field2592 = 2;
            class116.field1743 = arg0;
            class179.field2629 = arg1;
            class489.field7135++;
            class283.field3875 = 0;
            class491.method2878((byte) 92, class484.field7075);
            class481.field7027.method2355(1686288168, var7);
        }
        if (var6 == 23) {
            class116.field1743 = arg0;
            class283.field3875 = 0;
            class174.field2592 = 2;
            class65.field884++;
            class179.field2629 = arg1;
            class491.method2878((byte) 92, class65.field894);
            class481.field7027.method2355(1686288168, var7);
            class481.field7027.method2360(32, var4 + class510.field7566);
            class481.field7027.method2342(68, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2323(class14.field204 + var5, 79);
            class206.method1270(var4, var5, -118);
        }
        if (var6 == 50) {
            class502 var28 = class378.field5533[var7];
            if (var28 != null) {
                class453.field6660++;
                class174.field2592 = 2;
                class116.field1743 = arg0;
                class283.field3875 = 0;
                class179.field2629 = arg1;
                class491.method2878((byte) 92, class309.field4206);
                class481.field7027.method2360(32, class11.field171);
                class481.field7027.method2359(class250.field3462, -86);
                class481.field7027.method2323(class214.field2994, 74);
                class481.field7027.method2307(var7, -1069935832);
                class481.field7027.method2342(-126, class310.field4231.method901(0, 82) ? 1 : 0);
                class506.method3020(0, 0, -2096, true, -2, var28.method626((byte) 120), var28.field1117[0], var28.method626((byte) 120), var28.field1127[0]);
            }
        }
        if (var6 == 18) {
            class174.field2592 = 2;
            class116.field1743 = arg0;
            class326.field4461++;
            class179.field2629 = arg1;
            class283.field3875 = 0;
            class491.method2878((byte) 92, class121.field1790);
            class481.field7027.method2302(-4, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2307(var7, -1069935832);
            class481.field7027.method2355(1686288168, class510.field7566 + var4);
            class481.field7027.method2360(32, var5 + class14.field204);
            class481.field7027.method2329(24201, class250.field3462);
            class481.field7027.method2355(1686288168, class214.field2994);
            class481.field7027.method2360(32, class11.field171);
            class206.method1270(var4, var5, -115);
        }
        if (var6 == 30) {
            class116.field1743 = arg0;
            class283.field3875 = 0;
            class179.field2629 = arg1;
            class421.field6165++;
            class174.field2592 = 2;
            class491.method2878((byte) 92, class74.field1004);
            class481.field7027.method2360(32, class316.field4324.field1035);
            class481.field7027.method2312((byte) -84, class310.field4231.method901(0, 82) ? 1 : 0);
            class481.field7027.method2323(class11.field171, 82);
            class481.field7027.method2331(class250.field3462, false);
            class481.field7027.method2323(class214.field2994, 107);
        }
        if (var6 == 51) {
            class174.field2592 = 1;
            class183.field2680++;
            class179.field2629 = arg1;
            class116.field1743 = arg0;
            class283.field3875 = 0;
            class491.method2878((byte) 92, class136.field1956);
            class481.field7027.method2323(class214.field2994, 72);
            class481.field7027.method2323(class11.field171, 53);
            class481.field7027.method2323(class14.field204 + var5, 112);
            class481.field7027.method2360(32, class510.field7566 + var4);
            class481.field7027.method2359(class250.field3462, -97);
            class506.method3020(0, 0, -2096, true, -4, 1, var5, 1, var4);
        }
        if (var6 == 4 && class408.field5971 == null) {
            class202.method1258(0, var4, var5);
            class408.field5971 = class525.method3121(var4, var5, -9140);
            class370.method2222(0, class408.field5971);
        }
        if (var6 == 8) {
            class502 var29 = class378.field5533[var7];
            if (var29 != null) {
                class174.field2592 = 2;
                class463.field6808++;
                class116.field1743 = arg0;
                class283.field3875 = 0;
                class179.field2629 = arg1;
                class491.method2878((byte) 92, class497.field7243);
                class481.field7027.method2307(var7, -1069935832);
                class481.field7027.method2312((byte) -84, class310.field4231.method901(0, 82) ? 1 : 0);
                class506.method3020(0, 0, -2096, true, -2, var29.method626((byte) 120), var29.field1117[0], var29.method626((byte) 120), var29.field1127[0]);
            }
        }
        if (var6 == 44) {
            if (class68.field929 > 0 && class310.field4231.method901(0, 82) && class310.field4231.method901(0, 81)) {
                class422.method2513(class316.field4324.field1738, class510.field7566 + var4, class14.field204 + var5, (byte) 115);
            } else {
                class179.field2629 = arg1;
                class174.field2592 = 1;
                class283.field3875 = 0;
                class116.field1743 = arg0;
                class347.field4964++;
                class491.method2878((byte) 92, class296.field4068);
                class481.field7027.method2323(class14.field204 + var5, 73);
                class481.field7027.method2355(1686288168, class510.field7566 + var4);
            }
        }
        if (class59.field720) {
            class88.method668((byte) -70);
        }
        if (arg3 <= -49 && class70.field974 != null && class128.field1904 == 0) {
            class370.method2222(0, class70.field974);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILya;IIILga;I)V")
    public static final void method427(int arg0, class38 arg1, int arg2, int arg3, int arg4, class277 arg5, int arg6) {
        if (class373.field5474 < 100) {
            class388.method2283(true, arg5, arg1);
        }
        field575++;
        arg1.method279(arg6, arg0, arg6 + arg3, arg0 + arg4);
        if (class373.field5474 < 100) {
            byte var7 = 20;
            int var8 = arg3 / 2 + arg6;
            int var9 = arg4 / 2 + arg0 - var7 - 18;
            arg1.method243(arg6, arg0, arg3, arg4, -16777216, 0);
            arg1.method253(var8 - 152, var9, 304, 34, class116.field1739[class414.field6041].getRGB(), 0);
            arg1.method243(var8 - 150, var9 - -2, class373.field5474 * 3, 30, class341.field4922[class414.field6041].getRGB(), 0);
            class135.field1949.method1840(class269.field3719[class414.field6041].getRGB(), true, class407.field5954.method2731(62, class372.field5455), -1, var7 + var9, var8);
            return;
        }
        if (arg2 != 32637) {
            method426(48, 7, null, -24);
        }
        int var10 = class299.field4107 - (int) ((float) arg3 / class350.field5112);
        int var11 = (int) ((float) arg4 / class350.field5112) + class80.field1216;
        int var12 = class299.field4107 + ((int) ((float) arg3 / class350.field5112));
        class284.field3921 = (int) ((float) (arg3 * 2) / class350.field5112);
        class281.field3843 = (int) ((float) (arg4 * 2) / class350.field5112);
        int var13 = class80.field1216 - ((int) ((float) arg4 / class350.field5112));
        class193.field2759 = class299.field4107 - (int) ((float) arg3 / class350.field5112);
        class514.field7605 = class80.field1216 - ((int) ((float) arg4 / class350.field5112));
        class350.method2085(class350.field5133 + var10, class350.field5124 + var11, class350.field5133 + var12, class350.field5124 + var13, arg6, arg0, arg3 + arg6, arg0 + arg4 + 1);
        class350.method2087(arg1);
        class479 var14 = class350.method2096(arg1);
        class459.method2693(var14, 0, arg1, (byte) 90, 0);
        if (class222.field3167 > 0) {
            class193.field2756--;
            if (class193.field2756 == 0) {
                class222.field3167--;
                class193.field2756 = 20;
            }
        }
        if (!class225.field3200) {
            return;
        }
        int var15 = arg3 + arg6 - 5;
        int var16 = arg0 + arg4 - 8;
        class297.field4084.method1831(var16, -1, (byte) 3, var15, "Fps:" + class244.field3417, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class297.field4084.method1831(var20, -1, (byte) 3, var15, "Mem:" + var18 + "k", var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lap;III)V")
    public class48(class334 arg0, int arg1, int arg2, int arg3) {
        this.field573 = (byte) arg3;
        this.field572 = (short) arg1;
        this.field571 = arg0;
        this.field577 = (byte) arg2;
    }
}
