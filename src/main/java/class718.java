import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class718 implements class81 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lvaa;")
    private class543 field10244;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10249 = new String[] { method5212(method5211("0Y\"(\u0010")), method5212(method5211("'[9'\u000bk@+")), method5212(method5211(")D/9\u0012eG7:Z")), method5212(method5211(")X?.\u0005!^6")), method5212(method5211("?V(")), method5212(method5211("*G='\u0013+")), method5212(method5211("1U1")), method5212(method5211(")D/9@5X+s")), method5212(method5211("4[v\bH")), method5212(method5211("eG+ \u001a \r")), method5212(method5211("\tX? \u000eeD,,\u0010e\u0006`i\u000e*Cx?\u0001)^<i\u0006*Ex9\u0005+S1'\u0007\u0017R+9\u000f+D=t")), method5212(method5211("/V?=\b X*(")), method5212(method5211("4[v\fH")), method5212(method5211("4[vu\t+^,wH")), method5212(method5211(">\u0019vg\u001d")), method5212(method5211("+B4%")), method5212(method5211("4[v\u000fH")), method5212(method5211("4[v\u000bH")), method5212(method5211("4[v\u0002H")) };

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "D")
    public static double field10246;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field10243;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V", line = 4)
    public static final void method5209(byte arg0) {
        try {
            field10248++;
            if (class561.field8167 != 0 && class561.field8167 != 10) {
                try {
                    short var1;
                    if (class672.field9460 == 0) {
                        var1 = 250;
                    } else {
                        var1 = 2000;
                    }
                    if (class778.field11082 && class561.field8167 >= 6) {
                        var1 = 6000;
                    }
                    int var2 = -85 % ((68 - arg0) / 34);
                    if (class398.field5797 != 2 || class561.field8167 != 20 && class555.field8081 != 42) {
                        class355.field5156++;
                    }
                    if (class355.field5156 > var1) {
                        class341.field4966.method5604(1350);
                        if (class672.field9460 >= 3) {
                            class561.field8167 = 0;
                            class345.method2766((byte) 109, -5);
                            return;
                        }
                        if (class398.field5797 == 2) {
                            class467.field6812.method5713(76);
                        } else {
                            class671.field9456.method5713(116);
                        }
                        class355.field5156 = 0;
                        class561.field8167 = 1;
                        class672.field9460++;
                    }
                    if (class561.field8167 == 1) {
                        if (class398.field5797 == 2) {
                            class341.field4966.field11088 = class467.field6812.method5709(43594, class651.field9249);
                        } else {
                            class341.field4966.field11088 = class671.field9456.method5709(43594, class651.field9249);
                        }
                        class561.field8167 = 2;
                    }
                    if (class561.field8167 == 2) {
                        if (class341.field4966.field11088.field4486 == 2) {
                            throw new IOException();
                        }
                        if (class341.field4966.field11088.field4486 != 1) {
                            return;
                        }
                        class341.field4966.field11096 = class684.method4900((byte) -45, (Socket) class341.field4966.field11088.field4487, 15000);
                        class341.field4966.field11088 = null;
                        class341.field4966.method5607(99);
                        class274 var3 = class625.method4586((byte) 74);
                        if (class778.field11082) {
                            var3.field3885.method5114(255, class414.field5962.field5193);
                            var3.field3885.method5138((byte) -97, 0);
                            int var4 = var3.field3885.field9945;
                            var3.field3885.method5127(658, 26108);
                            if (class398.field5797 == 2) {
                                var3.field3885.method5114(255, class559.field8139 == 14 ? 1 : 0);
                            }
                            class711 var5 = class24.method282(21);
                            var5.method5114(255, class466.field6807);
                            var5.method5138((byte) -120, (int) (Math.random() * 9.9999999E7D));
                            var5.method5114(255, class405.field5883);
                            var5.method5127(class713.field10069, 26108);
                            for (int var6 = 0; var6 < 6; var6++) {
                                var5.method5127((int) (Math.random() * 9.9999999E7D), 26108);
                            }
                            var5.method5083((byte) 115, class788.field11375);
                            var5.method5114(255, class544.field7978.field11572);
                            var5.method5114(255, (int) (Math.random() * 9.9999999E7D));
                            var5.method5136(0, class297.field4152, class317.field4346);
                            var3.field3885.method5086(0, var5.field9996, var5.field9945, -2);
                            var3.field3885.method5091(var3.field3885.field9945 - var4, false);
                        } else {
                            var3.field3885.method5114(255, class414.field5949.field5193);
                        }
                        class341.field4966.method5608(var3, 29867);
                        class341.field4966.method5603(0);
                        class561.field8167 = 3;
                    }
                    if (class561.field8167 == 3) {
                        if (!class341.field4966.field11096.method316(-112, 1)) {
                            return;
                        }
                        class341.field4966.field11096.method313(0, -28221, 1, class341.field4966.field11099.field9996);
                        int var7 = class341.field4966.field11099.field9996[0] & 0xFF;
                        if (var7 != 0) {
                            class561.field8167 = 0;
                            class345.method2766((byte) 109, var7);
                            class341.field4966.method5604(1350);
                            class47.method534((byte) 53);
                            return;
                        }
                        if (class778.field11082) {
                            class561.field8167 = 4;
                        } else {
                            class561.field8167 = 8;
                        }
                    }
                    if (class561.field8167 == 4) {
                        if (!class341.field4966.field11096.method316(-118, 2)) {
                            return;
                        }
                        class341.field4966.field11096.method313(0, -28221, 2, class341.field4966.field11099.field9996);
                        class341.field4966.field11099.field9945 = 0;
                        class341.field4966.field11099.field9945 = class341.field4966.field11099.method5116((byte) -121);
                        class561.field8167 = 5;
                    }
                    if (class561.field8167 == 5) {
                        if (!class341.field4966.field11096.method316(-116, class341.field4966.field11099.field9945)) {
                            return;
                        }
                        class341.field4966.field11096.method313(0, -28221, class341.field4966.field11099.field9945, class341.field4966.field11099.field9996);
                        class341.field4966.field11099.method5092(class43.field634, (byte) 114);
                        class341.field4966.field11099.field9945 = 0;
                        String var8 = class341.field4966.field11099.method5096((byte) 78);
                        class341.field4966.field11099.field9945 = 0;
                        String var9 = field10249[5];
                        if (!class104.field1371 || class599.method4417(var8, 1, (byte) 113, var9, class651.field9249).field4486 == 2) {
                            class12.method81(class651.field9249, true, var9, -99, ~class451.field6612.field9134.method4717(3) == -2, var8);
                        }
                        class561.field8167 = 6;
                    }
                    if (class561.field8167 == 6) {
                        if (!class341.field4966.field11096.method316(-104, 1)) {
                            return;
                        }
                        class341.field4966.field11096.method313(0, -28221, 1, class341.field4966.field11099.field9996);
                        if ((class341.field4966.field11099.field9996[0] & 0xFF) == 1) {
                            class561.field8167 = 7;
                        }
                    }
                    if (class561.field8167 == 7) {
                        if (!class341.field4966.field11096.method316(-125, 16)) {
                            return;
                        }
                        class341.field4966.field11096.method313(0, -28221, 16, class341.field4966.field11099.field9996);
                        class341.field4966.field11099.field9945 = 16;
                        class341.field4966.field11099.method5092(class43.field634, (byte) 82);
                        class341.field4966.field11099.field9945 = 0;
                        class304.field4234 = class216.field3166 = class626.method4599((byte) -104, class341.field4966.field11099.method5147((byte) 127));
                        class35.field430 = class341.field4966.field11099.method5147((byte) 126);
                        class561.field8167 = 8;
                    }
                    if (class561.field8167 == 8) {
                        class341.field4966.field11099.field9945 = 0;
                        class341.field4966.method5607(73);
                        class274 var10 = class625.method4586((byte) 74);
                        class476 var11 = var10.field3885;
                        if (class398.field5797 == 2) {
                            class357 var16;
                            if (class778.field11082) {
                                var16 = class414.field5963;
                            } else {
                                var16 = class414.field5953;
                            }
                            var11.method5114(255, var16.field5193);
                            var11.method5138((byte) -96, 0);
                            int var17 = var11.field9945;
                            int var18 = var11.field9945;
                            if (!class778.field11082) {
                                var11.method5127(658, 26108);
                                var11.method5114(255, class559.field8139 == 14 ? 1 : 0);
                                int var19 = var11.field9945;
                                class711 var20 = class792.method5710(16);
                                var11.method5086(0, var20.field9996, var20.field9945, -2);
                                var18 = var11.field9945;
                                var11.method5089(class304.field4234, (byte) 35);
                            }
                            var11.method5114(255, class139.field1812);
                            var11.method5114(255, class680.method4883(-116));
                            var11.method5138((byte) -109, class391.field5700);
                            var11.method5138((byte) -103, class711.field9998);
                            var11.method5114(255, class451.field6612.field9132.method2747(3));
                            class619.method4553(var11, 255);
                            var11.method5089(class269.field3808, (byte) -75);
                            var11.method5127(class713.field10069, 26108);
                            class711 var21 = class451.field6612.method4685(-22);
                            var11.method5114(255, var21.field9945);
                            var11.method5086(0, var21.field9996, var21.field9945, -2);
                            class460.field6709 = true;
                            class711 var22 = new class711(class799.field11611.method306(false));
                            class799.field11611.method309(0, var22);
                            var11.method5086(0, var22.field9996, var22.field9996.length, -2);
                            var11.method5127(class292.field4116, 26108);
                            var11.method5083((byte) 115, class791.field11509);
                            var11.method5114(255, class799.field11615 == null ? 0 : 1);
                            if (class799.field11615 != null) {
                                var11.method5089(class799.field11615, (byte) -79);
                            }
                            var11.method5114(255, class451.method3497(field10249[11], 111) ? 1 : 0);
                            var11.method5114(255, class104.field1371 ? 1 : 0);
                            class713.method5165(var11, -96);
                            var11.method5100(var18, class43.field634, var11.field9945, 8);
                            var11.method5091(var11.field9945 - var17, false);
                        } else {
                            class357 var12;
                            if (class778.field11082) {
                                var12 = class414.field5963;
                            } else {
                                var12 = class414.field5955;
                            }
                            var11.method5114(255, var12.field5193);
                            var11.method5138((byte) -111, 0);
                            int var13 = var11.field9945;
                            int var14 = var11.field9945;
                            if (!class778.field11082) {
                                var11.method5127(658, 26108);
                                class711 var15 = class792.method5710(37);
                                var11.method5086(0, var15.field9996, var15.field9945, -2);
                                var14 = var11.field9945;
                                var11.method5089(class304.field4234, (byte) 121);
                            }
                            var11.method5114(255, class544.field7978.field11572);
                            var11.method5114(255, class405.field5883);
                            class619.method4553(var11, 255);
                            var11.method5089(class269.field3808, (byte) -88);
                            var11.method5127(class713.field10069, 26108);
                            class713.method5165(var11, 98);
                            var11.method5100(var14, class43.field634, var11.field9945, 8);
                            var11.method5091(var11.field9945 - var13, false);
                        }
                        class341.field4966.method5608(var10, 29867);
                        class341.field4966.method5603(0);
                        class341.field4966.field11100 = new class646(class43.field634);
                        for (int var23 = 0; var23 < 4; var23++) {
                            class43.field634[var23] += 50;
                        }
                        class341.field4966.field11099.method3682(class43.field634, (byte) -61);
                        class561.field8167 = 9;
                        class43.field634 = null;
                    }
                    if (class561.field8167 == 9) {
                        if (!class341.field4966.field11096.method316(-108, 1)) {
                            return;
                        }
                        class341.field4966.field11096.method313(0, -28221, 1, class341.field4966.field11099.field9996);
                        int var24 = class341.field4966.field11099.field9996[0] & 0xFF;
                        if (var24 == 21) {
                            class561.field8167 = 12;
                        } else if (var24 == 29 || var24 == 45) {
                            class510.field7495 = var24;
                            class561.field8167 = 18;
                        } else if (var24 == 1) {
                            class561.field8167 = 10;
                            class345.method2766((byte) 109, var24);
                            return;
                        } else if (var24 == 2) {
                            class561.field8167 = 13;
                        } else if (var24 == 15) {
                            class341.field4966.field11105 = -2;
                            class561.field8167 = 19;
                        } else if (var24 == 23 && class672.field9460 < 3) {
                            class672.field9460++;
                            class561.field8167 = 1;
                            class355.field5156 = 0;
                            class341.field4966.field11096.method318((byte) -104);
                            class341.field4966.field11096 = null;
                            return;
                        } else if (var24 == 42) {
                            class561.field8167 = 20;
                            class345.method2766((byte) 109, var24);
                            return;
                        } else if (!class161.field2066 || class778.field11082 || class466.field6807 == -1 || var24 != 35) {
                            class561.field8167 = 0;
                            class345.method2766((byte) 109, var24);
                            class341.field4966.field11096.method318((byte) -104);
                            class341.field4966.field11096 = null;
                            class47.method534((byte) 73);
                            return;
                        } else {
                            class561.field8167 = 1;
                            class778.field11082 = true;
                            class355.field5156 = 0;
                            class341.field4966.field11096.method318((byte) -104);
                            class341.field4966.field11096 = null;
                            return;
                        }
                    }
                    if (class561.field8167 == 11) {
                        class341.field4966.method5607(73);
                        class274 var25 = class625.method4586((byte) 74);
                        class476 var26 = var25.field3885;
                        var26.method3683(-6436, class341.field4966.field11100);
                        var26.method3680(class414.field5959.field5193, (byte) 0);
                        class341.field4966.method5608(var25, 29867);
                        class341.field4966.method5603(0);
                        class561.field8167 = 9;
                    } else if (class561.field8167 == 12) {
                        if (class341.field4966.field11096.method316(-118, 1)) {
                            class341.field4966.field11096.method313(0, -28221, 1, class341.field4966.field11099.field9996);
                            int var27 = class341.field4966.field11099.field9996[0] & 0xFF;
                            class706.field9873 = var27 * 50;
                            class561.field8167 = 0;
                            class345.method2766((byte) 109, 21);
                            class341.field4966.field11096.method318((byte) -104);
                            class341.field4966.field11096 = null;
                            class47.method534((byte) -128);
                        }
                    } else if (class561.field8167 == 20) {
                        if (class341.field4966.field11096.method316(-112, 2)) {
                            class341.field4966.field11096.method313(0, -28221, 2, class341.field4966.field11099.field9996);
                            class403.field5869 = (class341.field4966.field11099.field9996[0] & 0xFF << 8) + (class341.field4966.field11099.field9996[1] & 0xFF);
                            class561.field8167 = 9;
                        }
                    } else if (class561.field8167 == 18) {
                        if (class510.field7495 == 29) {
                            if (!class341.field4966.field11096.method316(-104, 1)) {
                                return;
                            }
                            class341.field4966.field11096.method313(0, -28221, 1, class341.field4966.field11099.field9996);
                            class649.field9228 = class341.field4966.field11099.field9996[0] & 0xFF;
                        } else if (class510.field7495 == 45) {
                            if (!class341.field4966.field11096.method316(-104, 3)) {
                                return;
                            }
                            class341.field4966.field11096.method313(0, -28221, 3, class341.field4966.field11099.field9996);
                            class649.field9228 = class341.field4966.field11099.field9996[0] & 0xFF;
                            class754.field10787 = ((class341.field4966.field11099.field9996[1] & 0xFF) << 8) + (class341.field4966.field11099.field9996[2] & 0xFF);
                        } else {
                            throw new IllegalStateException(field10249[10] + class510.field7495);
                        }
                        class561.field8167 = 0;
                        class345.method2766((byte) 109, class510.field7495);
                        class341.field4966.field11096.method318((byte) -104);
                        class341.field4966.field11096 = null;
                        class47.method534((byte) 65);
                    } else if (class561.field8167 != 13) {
                        if (class561.field8167 == 14) {
                            class476 var28 = class341.field4966.field11099;
                            if (class398.field5797 == 2) {
                                if (!class341.field4966.field11096.method316(-102, class127.field1598)) {
                                    return;
                                }
                                class341.field4966.field11096.method313(0, -28221, class127.field1598, var28.field9996);
                                var28.field9945 = 0;
                                class440.field6485 = var28.method5128(0);
                                class432.field6266 = var28.method5128(0);
                                class608.field8721 = var28.method5128(0) == 1;
                                class359.field5224 = var28.method5128(0) == 1;
                                class210.field3059 = var28.method5128(0) == 1;
                                class90.field1260 = var28.method5128(0) == 1;
                                class241.field3470 = var28.method5116((byte) -113);
                                class282.field3975 = var28.method5128(0) == 1;
                                class240.field3461 = var28.method5102(-347036064);
                                class260.field3696 = var28.method5128(0) == 1;
                                class101.field1359.method2829(-1, class260.field3696);
                                class153.field1955.method3244((byte) -112, class260.field3696);
                                class321.field4379.method599(50, class260.field3696);
                            } else if (class341.field4966.field11096.method316(-112, class127.field1598)) {
                                class341.field4966.field11096.method313(0, -28221, class127.field1598, var28.field9996);
                                var28.field9945 = 0;
                                class440.field6485 = var28.method5128(0);
                                class432.field6266 = var28.method5128(0);
                                class608.field8721 = var28.method5128(0) == 1;
                                class359.field5224 = var28.method5128(0) == 1;
                                class210.field3059 = var28.method5128(0) == 1;
                                class291.field4104 = var28.method5147((byte) 113);
                                class396.field5751 = -class614.method4531(-27) + (class291.field4104 - var28.method5104((byte) 52));
                                int var29 = var28.method5128(0);
                                class714.field10154 = (var29 & 0x2) != 0;
                                class282.field3975 = (var29 & 0x1) != 0;
                                class713.field10024 = var28.method5113(18443);
                                class765.field10918 = var28.method5128(0) == 1;
                                class134.field1675 = var28.method5113(18443);
                                class562.field8209 = var28.method5116((byte) -109);
                                class355.field5164 = var28.method5116((byte) -120);
                                class388.field5661 = var28.method5116((byte) -110);
                                class591.field8506 = var28.method5113(18443);
                                class465.field6780 = class651.field9249.method1565(3, class591.field8506);
                                class6.field81 = var28.method5128(0);
                                class717.field10222 = var28.method5116((byte) -106);
                                class717.field10232 = var28.method5116((byte) -125);
                                class149.field1901 = var28.method5128(0) == 1;
                                class203.field2988.field4905 = class203.field2988.field4941 = class427.field6150 = var28.method5096((byte) 17);
                                class12.field168 = var28.method5128(0);
                                class694.field9699 = var28.method5113(18443);
                                class723.field10285 = var28.method5128(0) == 1;
                                class628.field8956 = new class792();
                                class628.field8956.field11524 = var28.method5116((byte) -109);
                                if (class628.field8956.field11524 == 65535) {
                                    class628.field8956.field11524 = -1;
                                }
                                class628.field8956.field11516 = var28.method5096((byte) 27);
                                if (class398.field5793 != class35.field426) {
                                    class628.field8956.field11525 = class628.field8956.field11524 + 40000;
                                    class628.field8956.field11518 = class628.field8956.field11524 + 50000;
                                }
                                if (class581.field8393 != class35.field426 && (class447.field6570 != class35.field426 || class440.field6485 < 2) && class467.field6812.method5712((byte) 81, class405.field5878)) {
                                    class766.method5536(-280);
                                }
                            } else {
                                return;
                            }
                            if ((!class608.field8721 || class210.field3059) && !class282.field3975) {
                                try {
                                    class192.method1601(field10249[0], class290.field4091, 4368);
                                } catch (Throwable var36) {
                                }
                            } else {
                                try {
                                    class192.method1601(field10249[4], class290.field4091, 4368);
                                } catch (Throwable var37) {
                                    if (class364.field5276) {
                                        try {
                                            class290.field4091.getAppletContext().showDocument(new URL(class290.field4091.getCodeBase(), field10249[1]), field10249[6]);
                                        } catch (Exception var35) {
                                        }
                                    }
                                }
                            }
                            if (class398.field5793 == class35.field426) {
                                try {
                                    class192.method1601(field10249[3], class290.field4091, 4368);
                                } catch (Throwable var34) {
                                }
                            }
                            if (class398.field5797 != 2) {
                                class561.field8167 = 0;
                                class345.method2766((byte) 109, 2);
                                class236.method1958(true);
                                class699.method5035(7, 31754);
                                class341.field4966.field11112 = null;
                                return;
                            }
                            class561.field8167 = 16;
                        }
                        if (class561.field8167 == 16) {
                            if (!class341.field4966.field11096.method316(-122, 3)) {
                                return;
                            }
                            class341.field4966.field11096.method313(0, -28221, 3, class341.field4966.field11099.field9996);
                            class561.field8167 = 17;
                        }
                        if (class561.field8167 == 17) {
                            class476 var30 = class341.field4966.field11099;
                            var30.field9945 = 0;
                            if (var30.method3685(-7450)) {
                                if (!class341.field4966.field11096.method316(-126, 1)) {
                                    return;
                                }
                                class341.field4966.field11096.method313(3, -28221, 1, var30.field9996);
                            }
                            class341.field4966.field11112 = class324.method2565((byte) -122)[var30.method3684(63)];
                            class341.field4966.field11105 = var30.method5116((byte) -128);
                            class561.field8167 = 15;
                        }
                        if (class561.field8167 == 15) {
                            if (class341.field4966.field11096.method316(-108, class341.field4966.field11105)) {
                                class341.field4966.field11096.method313(0, -28221, class341.field4966.field11105, class341.field4966.field11099.field9996);
                                class341.field4966.field11099.field9945 = 0;
                                class561.field8167 = 0;
                                int var31 = class341.field4966.field11105;
                                class345.method2766((byte) 109, 2);
                                class259.method2158(-17499);
                                class180.method1502(class341.field4966.field11099, true);
                                class353.field5113 = -1;
                                if (class232.field3356 == class341.field4966.field11112) {
                                    class462.method3552((byte) -5);
                                } else {
                                    class677.method4854(1236953956);
                                }
                                if (class341.field4966.field11099.field9945 != var31) {
                                    throw new RuntimeException(field10249[7] + class341.field4966.field11099.field9945 + field10249[9] + var31);
                                }
                                class341.field4966.field11112 = null;
                            }
                        } else if (class561.field8167 == 19) {
                            if (class341.field4966.field11105 == -2) {
                                if (!class341.field4966.field11096.method316(-103, 2)) {
                                    return;
                                }
                                class341.field4966.field11096.method313(0, -28221, 2, class341.field4966.field11099.field9996);
                                class341.field4966.field11099.field9945 = 0;
                                class341.field4966.field11105 = class341.field4966.field11099.method5116((byte) -105);
                            }
                            if (class341.field4966.field11096.method316(-103, class341.field4966.field11105)) {
                                class341.field4966.field11096.method313(0, -28221, class341.field4966.field11105, class341.field4966.field11099.field9996);
                                class341.field4966.field11099.field9945 = 0;
                                int var32 = class341.field4966.field11105;
                                class561.field8167 = 0;
                                class345.method2766((byte) 109, 15);
                                class694.method4950(false);
                                class180.method1502(class341.field4966.field11099, true);
                                if (class341.field4966.field11099.field9945 != var32) {
                                    throw new RuntimeException(field10249[2] + class341.field4966.field11099.field9945 + field10249[9] + var32);
                                }
                                class341.field4966.field11112 = null;
                            }
                        }
                    } else if (class341.field4966.field11096.method316(-120, 1)) {
                        class341.field4966.field11096.method313(0, -28221, 1, class341.field4966.field11099.field9996);
                        class127.field1598 = class341.field4966.field11099.field9996[0] & 0xFF;
                        class561.field8167 = 14;
                    }
                } catch (IOException var38) {
                    class341.field4966.method5604(1350);
                    if (class672.field9460 >= 3) {
                        class561.field8167 = 0;
                        class345.method2766((byte) 109, -4);
                        class47.method534((byte) -127);
                    } else {
                        if (class398.field5797 == 2) {
                            class467.field6812.method5713(117);
                        } else {
                            class671.field9456.method5713(116);
                        }
                        class672.field9460++;
                        class561.field8167 = 1;
                        class355.field5156 = 0;
                    }
                }
            }
        } catch (RuntimeException var39) {
            throw class665.method4799(var39, field10249[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V", line = 760)
    public final void method801(int arg0, boolean arg1) {
        try {
            if (arg1) {
                class236.field3418.method237(0, 0, class391.field5700, class711.field9998, this.field10244.field7939, 0);
            }
            int var3 = 55 / ((arg0 - 15) / 60);
            field10245++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10249[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII[FIB)V", line = 772)
    public static final void method5210(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, byte arg6) {
        try {
            if (arg6 <= -127) {
                field10242++;
                if (arg3 > 0 && !class357.method2858(arg3, false)) {
                    throw new IllegalArgumentException("");
                } else if (arg1 <= 0 || class357.method2858(arg1, false)) {
                    int var7 = class507.method3875(arg5, 126);
                    int var8 = 0;
                    int var9 = arg3 < arg1 ? arg3 : arg1;
                    int var10 = arg3 >> 1;
                    int var11 = arg1 >> 1;
                    float[] var12 = arg4;
                    float[] var13 = new float[var7 * var10 * var11];
                    while (true) {
                        OpenGL.glTexImage2Df(arg0, var8, arg2, arg3, arg1, 0, arg5, 5126, var12, 0);
                        if (var9 <= 1) {
                            return;
                        }
                        int var14 = arg3 * var7;
                        float[] var15 = var13;
                        for (int var16 = 0; var16 < var7; var16++) {
                            int var17 = var16;
                            int var18 = var16;
                            int var19 = var14 + var16;
                            for (int var20 = 0; var20 < var11; var20++) {
                                for (int var21 = 0; var21 < var10; var21++) {
                                    float var22 = var12[var18];
                                    int var23 = var7 + var18;
                                    float var24 = var12[var23] + var22;
                                    var18 = var7 + var23;
                                    float var25 = var12[var19] + var24;
                                    int var26 = var7 + var19;
                                    float var27 = var12[var26] + var25;
                                    var13[var17] = var27 * 0.25F;
                                    var19 = var7 + var26;
                                    var17 += var7;
                                }
                                var18 += var14;
                                var19 += var14;
                            }
                        }
                        var13 = var12;
                        var12 = var15;
                        arg1 = var11;
                        arg3 = var10;
                        var11 >>= 0x1;
                        var9 >>= 0x1;
                        var8++;
                        var10 >>= 0x1;
                    }
                } else {
                    throw new IllegalArgumentException("");
                }
            }
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field10249[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field10249[15] : field10249[14]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Z", line = 870)
    public final boolean method800(byte arg0) {
        try {
            if (arg0 > -2) {
                method5209((byte) 26);
            }
            field10247++;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10249[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lvaa;)V", line = 885)
    public class718(class543 arg0) {
        try {
            this.field10244 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10249[13] + (arg0 == null ? field10249[15] : field10249[14]) + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 893)
    public final void method802(int arg0) {
        try {
            int var2 = 50 % ((arg0 - 38) / 41);
            field10243++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10249[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5211(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5212(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
