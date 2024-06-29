import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class85 extends class320 {

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field1209 = -1;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    private int field1207 = 0;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Lrg;")
    public static class342 field1220 = null;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "F")
    public static float field1212;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "[Lho;")
    public static class215[] field1216;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "[Lqg;")
    public static class316[] field1217;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V", line = 11)
    public final void method765(int arg0) {
        int var2 = class110.method955(-1);
        field1218++;
        if ((var2 & 0x1) == 0) {
            class240.method1786(this.field1209);
        }
        if ((var2 & 0x2) == 0) {
            class240.method1814(0);
        }
        int var3 = 59 % ((arg0 + 68) / 37);
        if ((var2 & 0x4) == 0) {
            class240.method1806(0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V", line = 31)
    public static final void method766(int arg0) {
        if (arg0 != -23704) {
            field1220 = (class342) null;
        }
        class326.field5007.method655(-1);
        field1208++;
        class353.field5639.method655(-1);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)Z", line = 44)
    public static final boolean method767(int arg0, int arg1, int arg2) {
        field1213++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class212 var3 = class43.method437(81, arg0);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return arg1 == 0 ? var3.method1566(arg2, (byte) 28) : true;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILud;)V", line = 63)
    public static final void method768(int arg0, class91 arg1) {
        field1214++;
        if (arg1.field1288 == 0) {
            return;
        }
        class109 var2 = arg1.method813((byte) 115);
        if (~arg1.field1364 != arg0 && arg1.field1364 < 32768) {
            class244 var3 = class110.field1683[arg1.field1364];
            if (var3 != null) {
                int var4 = arg1.field1359 - var3.field1359;
                int var5 = arg1.field1286 - var3.field1286;
                if (var4 != 0 || var5 != 0) {
                    arg1.field1289 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1364 >= 32768) {
            int var6 = arg1.field1364 - 32768;
            if (class118.field1813 == var6) {
                var6 = 2047;
            }
            class171 var7 = class177.field2795[var6];
            if (var7 != null) {
                int var8 = arg1.field1286 - var7.field1286;
                int var9 = arg1.field1359 - var7.field1359;
                if (var9 != 0 || var8 != 0) {
                    arg1.field1289 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1371 != 0 || arg1.field1333 != 0) && (arg1.field1321 == 0 || arg1.field1341 > 0)) {
            int var10 = arg1.field1359 - (arg1.field1371 - class358.field5696 - class358.field5696) * 64;
            int var11 = arg1.field1286 - (arg1.field1333 - class49.field755 - class49.field755) * 64;
            if (var10 != 0 || var11 != 0) {
                arg1.field1289 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field1333 = 0;
            arg1.field1371 = 0;
        }
        int var12 = arg1.field1289 - arg1.field1320 & 0x7FF;
        if (var12 == 0) {
            arg1.field1281 = 0;
            arg1.field1283 = 0;
        } else if (var2.field1639 == 0) {
            arg1.field1281++;
            if (var12 > 1024) {
                arg1.field1320 -= arg1.field1288;
                boolean var20 = true;
                if (arg1.field1288 > var12 || var12 > 2048 - arg1.field1288) {
                    arg1.field1320 = arg1.field1289;
                    var20 = false;
                }
                if (arg1.field1281 > 25 || var20) {
                    arg1.field1350 = var2.field1646;
                    if (arg1.field1321 > 0) {
                        if (arg1.field1375[arg1.field1321 - 1] == 2) {
                            if (var2.field1629 != -1) {
                                arg1.field1350 = var2.field1629;
                            } else if (var2.field1673 != -1) {
                                arg1.field1350 = var2.field1673;
                            }
                        } else if (arg1.field1375[arg1.field1321 - 1] == 0) {
                            if (var2.field1647 != -1) {
                                arg1.field1350 = var2.field1647;
                            } else if (var2.field1666 != -1) {
                                arg1.field1350 = var2.field1666;
                            }
                        } else if (var2.field1638 != -1) {
                            arg1.field1350 = var2.field1638;
                        }
                    } else if (var2.field1650 != -1) {
                        arg1.field1350 = var2.field1650;
                    }
                }
            } else {
                arg1.field1320 += arg1.field1288;
                boolean var21 = true;
                if (arg1.field1288 > var12 || var12 > 2048 - arg1.field1288) {
                    var21 = false;
                    arg1.field1320 = arg1.field1289;
                }
                if (arg1.field1281 > 25 || var21) {
                    arg1.field1350 = var2.field1646;
                    if (arg1.field1321 > 0) {
                        if (arg1.field1375[arg1.field1321 - 1] == 2) {
                            if (var2.field1645 != -1) {
                                arg1.field1350 = var2.field1645;
                            } else if (var2.field1673 != -1) {
                                arg1.field1350 = var2.field1673;
                            }
                        } else if (arg1.field1375[arg1.field1321 - 1] == 0) {
                            if (var2.field1669 != -1) {
                                arg1.field1350 = var2.field1669;
                            } else if (var2.field1666 != -1) {
                                arg1.field1350 = var2.field1666;
                            }
                        } else if (var2.field1668 != -1) {
                            arg1.field1350 = var2.field1668;
                        }
                    } else if (var2.field1630 != -1) {
                        arg1.field1350 = var2.field1630;
                    }
                }
            }
            arg1.field1320 &= 0x7FF;
        } else {
            int var13 = arg1.field1289 << 5;
            arg1.field1350 = -1;
            if (arg1.field1296 != var13) {
                arg1.field1312 = 0;
                arg1.field1296 = var13;
                int var14 = var13 - arg1.field1285 & 0xFFFF;
                int var15 = arg1.field1283 * arg1.field1283 / (var2.field1639 * 2);
                if (arg1.field1283 > 0 && var14 >= var15 && var14 - var15 < 32768) {
                    int var16 = var2.field1648 * var2.field1648 / (var2.field1639 * 2);
                    arg1.field1287 = true;
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    arg1.field1319 = var14 / 2;
                    if (var16 < arg1.field1319) {
                        arg1.field1319 = var14 - var16;
                    }
                } else if (arg1.field1283 < 0 && var15 <= 65536 - var14 && 65536 - var14 - var15 < 32768) {
                    arg1.field1319 = (65536 - var14) / 2;
                    arg1.field1287 = true;
                    int var17 = var2.field1648 * var2.field1648 / (var2.field1639 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (var17 < arg1.field1319) {
                        arg1.field1319 = 65536 - var14 - var17;
                    }
                } else {
                    arg1.field1287 = false;
                }
            }
            if (arg1.field1283 == 0) {
                int var18 = arg1.field1296 - arg1.field1285 & 0xFFFF;
                if (var2.field1639 <= var18) {
                    arg1.field1287 = true;
                    int var19 = var2.field1648 * var2.field1648 / (var2.field1639 * 2);
                    arg1.field1312 = 0;
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 < 32768) {
                        arg1.field1319 = var18 / 2;
                        if (var19 < arg1.field1319) {
                            arg1.field1319 = var18 - var19;
                        }
                        arg1.field1283 = var2.field1639;
                    } else {
                        arg1.field1283 = -var2.field1639;
                        arg1.field1319 = (65536 - var18) / 2;
                        if (arg1.field1319 > var19) {
                            arg1.field1319 = 65536 - var18 - var19;
                        }
                    }
                } else {
                    arg1.field1285 = arg1.field1296;
                }
            } else if (arg1.field1283 <= 0) {
                if (arg1.field1312 >= arg1.field1319) {
                    arg1.field1287 = false;
                }
                if (!arg1.field1287) {
                    arg1.field1283 += var2.field1639;
                    if (arg1.field1283 > 0) {
                        arg1.field1283 = 0;
                    }
                } else if (-var2.field1648 < arg1.field1283) {
                    arg1.field1283 -= var2.field1639;
                }
            } else {
                if (arg1.field1319 <= arg1.field1312) {
                    arg1.field1287 = false;
                }
                if (!arg1.field1287) {
                    arg1.field1283 -= var2.field1639;
                    if (arg1.field1283 < 0) {
                        arg1.field1283 = 0;
                    }
                } else if (var2.field1648 > arg1.field1283) {
                    arg1.field1283 += var2.field1639;
                }
            }
            arg1.field1285 += arg1.field1283;
            arg1.field1285 &= 0xFFFF;
            if (arg1.field1283 <= 0) {
                arg1.field1312 -= arg1.field1283;
            } else {
                arg1.field1312 += arg1.field1283;
            }
            arg1.field1320 = arg1.field1285 >> 5;
            if (arg1.field1283 >= 0) {
                if (arg1.field1321 > 0) {
                    if (arg1.field1375[arg1.field1321 - 1] == 2) {
                        if (var2.field1645 != -1) {
                            arg1.field1350 = var2.field1645;
                        } else if (var2.field1673 != -1) {
                            arg1.field1350 = var2.field1673;
                        }
                    } else if (arg1.field1375[arg1.field1321 - 1] == 0) {
                        if (var2.field1669 != -1) {
                            arg1.field1350 = var2.field1669;
                        } else if (var2.field1666 != -1) {
                            arg1.field1350 = var2.field1666;
                        }
                    }
                }
                if (arg1.field1350 == -1) {
                    if (var2.field1668 != -1) {
                        arg1.field1350 = var2.field1668;
                    } else if (var2.field1630 != -1) {
                        arg1.field1350 = var2.field1630;
                    }
                }
            } else {
                if (arg1.field1321 > 0) {
                    if (arg1.field1375[arg1.field1321 - 1] == 2) {
                        if (var2.field1629 != -1) {
                            arg1.field1350 = var2.field1629;
                        } else if (var2.field1673 != -1) {
                            arg1.field1350 = var2.field1673;
                        }
                    } else if (arg1.field1375[arg1.field1321 - 1] == 0) {
                        if (var2.field1647 != -1) {
                            arg1.field1350 = var2.field1647;
                        } else if (var2.field1666 != -1) {
                            arg1.field1350 = var2.field1666;
                        }
                    }
                }
                if (arg1.field1350 == -1) {
                    if (var2.field1638 != -1) {
                        arg1.field1350 = var2.field1638;
                    } else if (var2.field1650 != -1) {
                        arg1.field1350 = var2.field1650;
                    }
                }
            }
            if (arg1.field1350 == -1) {
                arg1.field1350 = var2.field1646;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V", line = 492)
    public static void method769(int arg0) {
        if (arg0 >= 119) {
            field1216 = null;
            field1217 = null;
            field1220 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIB)V", line = 513)
    public static final void method770(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class239.field3720 * arg2 >> 8;
        field1219++;
        if (arg3 < 81) {
            field1217 = (class316[]) null;
        }
        if (var4 != 0 && arg1 != -1) {
            class43.method439(0, false, false, var4, arg1, class160.field2548);
            class212.field3331 = true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V", line = 532)
    protected final void finalize() throws Throwable {
        if (this.field1209 != -1) {
            class28.method324(this.field1209, this.field1207, this.field1215);
            this.field1209 = -1;
            this.field1207 = 0;
        }
        field1221++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V", line = 582)
    public class85(int arg0) {
        GL var2 = class240.field3771;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field1215 = class28.field455;
        this.field1209 = var3[0];
        class240.method1786(this.field1209);
        int var4 = class107.field1603[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class28.field459 += var6.limit() - this.field1207;
        this.field1207 = var6.limit();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIIIB)V", line = 558)
    public static final void method771(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -104) {
            field1216 = (class215[]) null;
        }
        field1210++;
        class62.method623(25821, false);
        class170.field2680 = arg1;
        class115.field1768 = arg0;
        class75.field1110 = arg3;
        class351.method2478(arg2);
        class50.field783 = new class37(8);
        class301.field4683 = new class37(8);
    }
}
