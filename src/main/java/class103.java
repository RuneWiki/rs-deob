import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class103 extends class115 {

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static int field1670 = 0;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "Lok;")
    private static class146 field1663 = class235.method1724(-12908, "skill: ");

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "Lok;")
    public static class146 field1668 = field1663;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "B")
    public byte field1666;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "Lwe;")
    public class47 field1672;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V", line = 10)
    public static void method702(int arg0) {
        field1668 = null;
        if (arg0 != -12) {
            field1668 = (class146) null;
        }
        field1663 = null;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)I", line = 28)
    public final int method703(int arg0) {
        field1671++;
        if (arg0 == 28977) {
            return this.field1672 == null ? 0 : this.field1672.field857 * 100 / (this.field1672.field860.length - this.field1666);
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BII)V", line = 43)
    public static final void method704(byte arg0, int arg1, int arg2) {
        if (arg0 != -77) {
            method704((byte) -21, -39, -125);
        }
        class158 var3 = class206.method1564(arg1, 1, -114);
        var3.method1236(-13730);
        var3.field2663 = arg2;
        field1667++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V", line = 59)
    public static final void method705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class252.field4221 = 0;
        field1664++;
        for (int var7 = -1; var7 < (class158.field2670 + class151.field2574); var7++) {
            class318 var8;
            if (var7 == -1) {
                var8 = class102.field1639;
            } else if (var7 < class158.field2670) {
                var8 = class75.field1215[class112.field1791[var7]];
            } else {
                var8 = class173.field2906[class210.field3476[var7 - class158.field2670]];
            }
            if (var8 != null && var8.method1719((byte) -122)) {
                if (var8 instanceof class282) {
                    class301 var9 = ((class282) var8).field4838;
                    if (var9.field5092 != null) {
                        var9 = var9.method2135(-1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class158.field2670) {
                    class301 var15 = ((class282) var8).field4838;
                    if (var15.field5092 != null) {
                        var15 = var15.method2135(-1);
                    }
                    if (var15.field5147 >= 0 && var15.field5147 < class35.field657.length) {
                        int var16;
                        if (var15.field5138 == -1) {
                            var16 = var8.method2217((byte) 116) + 15;
                        } else {
                            var16 = var15.field5138 + 15;
                        }
                        class133.method988(arg3, arg6 >> 1, arg4 >> 1, arg1, false, var16, var8);
                        if (class51.field920 > -1) {
                            class35.field657[var15.field5147].method47(arg5 + class51.field920 - 12, arg0 + -30 - -class303.field5207);
                        }
                    }
                    class197[] var17 = class216.field3569;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class197 var19 = var17[var18];
                        if (var19 != null && var19.field3285 == 1 && class210.field3476[var7 - class158.field2670] == var19.field3289 && (class203.field3385 % 20) < 10) {
                            int var20;
                            if (var15.field5138 == -1) {
                                var20 = var8.method2217((byte) 114) + 15;
                            } else {
                                var20 = var15.field5138 + 15;
                            }
                            class133.method988(arg3, arg6 >> 1, arg4 >> 1, arg1, false, var20, var8);
                            if (class51.field920 > -1) {
                                class126.field2056[var19.field3288].method47(class51.field920 + arg5 - 12, class303.field5207 + -28 + arg0);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class234 var11 = (class234) var8;
                    if (var11.field3907 != -1 || var11.field3925 != -1) {
                        class133.method988(arg3, arg6 >> 1, arg4 >> 1, arg1, false, var8.method2217((byte) 115) + 15, var8);
                        if (class51.field920 > -1) {
                            if (var11.field3907 != -1) {
                                class227.field3786[var11.field3907].method47(class51.field920 + arg5 - 12, -var10 + arg0 + class303.field5207);
                                var10 += 25;
                            }
                            if (var11.field3925 != -1) {
                                class35.field657[var11.field3925].method47(class51.field920 + arg5 - 12, arg0 - (-class303.field5207 - -var10));
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class197[] var13 = class216.field3569;
                        while (var12 < var13.length) {
                            class197 var14 = var13[var12];
                            if (var14 != null && var14.field3285 == 10 && class112.field1791[var7] == var14.field3289) {
                                class133.method988(arg3, arg6 >> 1, arg4 >> 1, arg1, false, var8.method2217((byte) 111) + 15, var8);
                                if (class51.field920 > -1) {
                                    class126.field2056[var14.field3288].method47(class51.field920 + arg5 - 12, class303.field5207 + arg0 - var10);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field5445 != null && (class158.field2670 <= var7 || class106.field1716 == 0 || class106.field1716 == 3 || class106.field1716 == 1 && class51.method414((byte) 111, ((class234) var8).field3891))) {
                    class133.method988(arg3, arg6 >> 1, arg4 >> 1, arg1, false, var8.method2217((byte) 113), var8);
                    if (class51.field920 > -1 && class239.field3982 > class252.field4221) {
                        class239.field3990[class252.field4221] = class39.field695.method207(var8.field5445) / 2;
                        class239.field3978[class252.field4221] = class39.field695.field553;
                        class239.field3985[class252.field4221] = class51.field920;
                        class239.field3993[class252.field4221] = class303.field5207;
                        class239.field3979[class252.field4221] = var8.field5375;
                        class239.field3980[class252.field4221] = var8.field5388;
                        class239.field3986[class252.field4221] = var8.field5411;
                        class239.field3994[class252.field4221] = var8.field5445;
                        class252.field4221++;
                    }
                }
                if (var8.field5410 > class203.field3385) {
                    class70 var21 = class75.field1216[0];
                    class70 var22 = class75.field1216[1];
                    int var23;
                    if ((var8 instanceof class282)) {
                        class282 var24 = (class282) var8;
                        class70[] var25 = (class70[]) ((class70[]) class89.field1421.method799((byte) 52, (long) var24.field4838.field5100));
                        if (var25 == null) {
                            var25 = class296.method2105(4961, class196.field3273, 0, var24.field4838.field5100);
                            if (var25 != null) {
                                class89.field1421.method797(var25, 0, (long) var24.field4838.field5100);
                            }
                        }
                        class301 var26 = var24.field4838;
                        if (var25 != null && var25.length == 2) {
                            var21 = var25[0];
                            var22 = var25[1];
                        }
                        if (var26.field5138 == -1) {
                            var23 = var8.method2217((byte) 126);
                        } else {
                            var23 = var26.field5138;
                        }
                    } else {
                        var23 = var8.method2217((byte) 122);
                    }
                    class133.method988(arg3, arg6 >> 1, arg4 >> 1, arg1, false, var23 + var21.field1155 + 10, var8);
                    if (class51.field920 > -1) {
                        int var27 = arg5 + class51.field920 - (var21.field1145 >> 1);
                        int var28 = class303.field5207 + arg0 - 3;
                        var21.method47(var27, var28);
                        int var29 = var8.field5376 * var21.field1145 / 255;
                        int var30 = var21.field1155;
                        if (class271.field4640) {
                            class131.method964(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class181.method1427(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method47(var27, var28);
                        if (class271.field4640) {
                            class131.method973(arg5, arg0, arg5 + arg6, arg0 - -arg4);
                        } else {
                            class181.method1420(arg5, arg0, arg5 + arg6, arg0 - -arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class203.field3385 < var8.field5436[var31]) {
                        int var32;
                        if ((var8 instanceof class282)) {
                            class282 var33 = (class282) var8;
                            class301 var34 = var33.field4838;
                            if (var34.field5138 == -1) {
                                var32 = var8.method2217((byte) 122) / 2;
                            } else {
                                var32 = var34.field5138 / 2;
                            }
                        } else {
                            var32 = var8.method2217((byte) 116) / 2;
                        }
                        class133.method988(arg3, arg6 >> 1, arg4 >> 1, arg1, false, var32, var8);
                        if (class51.field920 > -1) {
                            if (var31 == 1) {
                                class303.field5207 -= 20;
                            }
                            if (var31 == 2) {
                                class51.field920 -= 15;
                                class303.field5207 -= 10;
                            }
                            if (var31 == 3) {
                                class51.field920 += 15;
                                class303.field5207 -= 10;
                            }
                            class124.field2027[var8.field5444[var31]].method47(arg5 + class51.field920 - 12, class303.field5207 + arg0 - 12);
                            class274.field4725.method209(class82.method585(14744, var8.field5446[var31]), class51.field920 + arg5 - 1, class303.field5207 + 3 + arg0, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var35 = 0;
        if (arg2 != 1) {
            method705(-64, -71, -37, 13, 106, -113, -5);
        }
        while (class252.field4221 > var35) {
            int var36 = class239.field3993[var35];
            int var37 = class239.field3990[var35];
            int var38 = class239.field3978[var35];
            int var39 = class239.field3985[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class239.field3993[var41] - class239.field3978[var41] < var36 + 2 && (var36 - var38) < (class239.field3993[var41] + 2) && var39 - var37 < class239.field3990[var41] + class239.field3985[var41] && (var37 + var39) > (class239.field3985[var41] - class239.field3990[var41]) && var36 > class239.field3993[var41] - class239.field3978[var41]) {
                        var36 = class239.field3993[var41] - class239.field3978[var41];
                        var40 = true;
                    }
                }
            }
            class51.field920 = class239.field3985[var35];
            class303.field5207 = class239.field3993[var35] = var36;
            class146 var42 = class239.field3994[var35];
            if (class278.field4778 == 0) {
                int var43 = 16776960;
                if (class239.field3979[var35] < 6) {
                    var43 = class86.field1371[class239.field3979[var35]];
                }
                if (class239.field3979[var35] == 6) {
                    var43 = (class260.field4321 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class239.field3979[var35] == 7) {
                    var43 = (class260.field4321 % 20) < 10 ? 255 : 65535;
                }
                if (class239.field3979[var35] == 8) {
                    var43 = (class260.field4321 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class239.field3979[var35] == 9) {
                    int var44 = 150 - class239.field3986[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 * 327680 - 16384000);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class239.field3979[var35] == 10) {
                    int var45 = 150 - class239.field3986[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 + 16384000 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = ((var45 - 100) * 327680) + 255 - ((var45 + -100) * 5);
                    }
                }
                if (class239.field3979[var35] == 11) {
                    int var46 = 150 - class239.field3986[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class239.field3980[var35] == 0) {
                    class39.field695.method209(var42, class51.field920 + arg5, class303.field5207 + arg0, var43, 0);
                }
                if (class239.field3980[var35] == 1) {
                    class39.field695.method216(var42, class51.field920 + arg5, class303.field5207 + arg0, var43, 0, class260.field4321);
                }
                if (class239.field3980[var35] == 2) {
                    class39.field695.method201(var42, class51.field920 + arg5, arg0 - -class303.field5207, var43, 0, class260.field4321);
                }
                if (class239.field3980[var35] == 3) {
                    class39.field695.method221(var42, class51.field920 + arg5, class303.field5207 + arg0, var43, 0, class260.field4321, 150 - class239.field3986[var35]);
                }
                if (class239.field3980[var35] == 4) {
                    int var47 = (150 - class239.field3986[var35]) * (class39.field695.method207(var42) + 100) / 150;
                    if (class271.field4640) {
                        class131.method964(class51.field920 + arg5 - 50, arg0, arg5 + class51.field920 + 50, arg0 + arg4);
                    } else {
                        class181.method1427(class51.field920 + arg5 - 50, arg0, arg5 + class51.field920 + 50, arg0 + arg4);
                    }
                    class39.field695.method210(var42, class51.field920 + arg5 + 50 - var47, class303.field5207 + arg0, var43, 0);
                    if (class271.field4640) {
                        class131.method973(arg5, arg0, arg5 + arg6, arg0 + arg4);
                    } else {
                        class181.method1420(arg5, arg0, arg5 + arg6, arg0 - -arg4);
                    }
                }
                if (class239.field3980[var35] == 5) {
                    int var48 = 150 - class239.field3986[var35];
                    int var49 = 0;
                    if (class271.field4640) {
                        class131.method964(arg5, class303.field5207 + arg0 - (class39.field695.field553 + 1), arg5 - -arg6, arg0 + class303.field5207 + 5);
                    } else {
                        class181.method1427(arg5, arg0 + class303.field5207 - class39.field695.field553 - 1, arg5 - -arg6, arg0 + class303.field5207 + 5);
                    }
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class39.field695.method209(var42, class51.field920 + arg5, arg0 + var49 - -class303.field5207, var43, 0);
                    if (class271.field4640) {
                        class131.method973(arg5, arg0, arg5 + arg6, arg0 + arg4);
                    } else {
                        class181.method1420(arg5, arg0, arg5 + arg6, arg0 + arg4);
                    }
                }
            } else {
                class39.field695.method209(var42, class51.field920 + arg5, class303.field5207 + arg0, 16776960, 0);
            }
            var35++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)[B", line = 539)
    public final byte[] method706(int arg0) {
        if (arg0 != 100) {
            return (byte[]) null;
        }
        field1669++;
        if (this.field1856 || this.field1672.field857 < this.field1672.field860.length - this.field1666) {
            throw new RuntimeException();
        }
        return this.field1672.field860;
    }
}
