import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class488 {

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "Lpfa;")
    private class275 field6101;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "[[I")
    private int[][] field6105;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    private int field6099;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "[Z")
    private boolean[] field6104;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Z")
    public static boolean field6100;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "[I")
    public static int[] field6106;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method2652(int arg0, int arg1) {
        field6107++;
        if (arg1 >= 0 && this.field6105.length > arg1) {
            if (arg0 >= -106) {
                method2654((byte) -17);
            }
            if (!this.field6104[arg1] || this.field6105[arg1].length <= 1) {
                return this.field6105[arg1];
            }
            int var3 = this.field6099 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field6105[arg1].length];
            class70.method556(this.field6105[arg1], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class396.method2241(0, var5.length - var3, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else if (this.field6099 == -1) {
            return new int[0];
        } else {
            return new int[] { this.field6099 };
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lwv;I)V", line = 54)
    public static final void method2653(class32 arg0, int arg1) {
        arg0.field435 = 0;
        field6098++;
        if (arg0.field465 != -1) {
            class207 var2 = class11.field110.method1141(arg0.field465, (byte) -106);
            if (var2 == null || var2.field2441 == null) {
                arg0.field465 = -1;
                arg0.field488 = false;
            } else {
                label401: {
                    arg0.field444++;
                    if (var2.field2441.length > arg0.field487 && arg0.field444 > var2.field2436[arg0.field487]) {
                        arg0.field487++;
                        arg0.field444 = 1;
                        arg0.field442++;
                        class526.method2841(-305539927, arg0.field8010, var2, class67.field815 == arg0, arg0.field8018, arg0.field487, arg0.field8011);
                    }
                    if (var2.field2441.length <= arg0.field487) {
                        arg0.field487 = 0;
                        arg0.field444 = 0;
                        if (arg0.field488) {
                            arg0.field465 = arg0.method209(2).method2267(102);
                            if (arg0.field465 == -1) {
                                arg0.field488 = false;
                                break label401;
                            }
                            var2 = class11.field110.method1141(arg0.field465, (byte) -45);
                        }
                        class526.method2841(-305539927, arg0.field8010, var2, class67.field815 == arg0, arg0.field8018, arg0.field487, arg0.field8011);
                    }
                    arg0.field442 = arg0.field487 + 1;
                    if (var2.field2441.length <= arg0.field442) {
                        arg0.field442 = 0;
                    }
                }
            }
        }
        if (arg1 <= 100) {
            field6106 = null;
        }
        if (arg0.field429 != -1 && class665.field9027 >= arg0.field460) {
            class561 var3 = class339.field4336.method2158((byte) -25, arg0.field429);
            int var4 = var3.field7016;
            if (var4 == -1) {
                arg0.field429 = -1;
            } else {
                label403: {
                    class207 var5 = class11.field110.method1141(var4, (byte) -21);
                    if (var3.field7006) {
                        if (var5.field2424 == 3) {
                            if (arg0.field506 > 0 && arg0.field470 <= class665.field9027 && arg0.field445 < class665.field9027) {
                                arg0.field429 = -1;
                                break label403;
                            }
                        } else if (var5.field2424 == 1 && arg0.field506 > 0 && class665.field9027 >= arg0.field470 && arg0.field445 < class665.field9027) {
                            arg0.field460 = class665.field9027 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field2441 == null) {
                        arg0.field429 = -1;
                    } else {
                        if (arg0.field451 < 0) {
                            arg0.field451 = 0;
                            class526.method2841(-305539927, arg0.field8010, var5, class67.field815 == arg0, arg0.field8018, 0, arg0.field8011);
                        }
                        arg0.field457++;
                        if (arg0.field451 < var5.field2441.length && var5.field2436[arg0.field451] < arg0.field457) {
                            arg0.field451++;
                            arg0.field457 = 1;
                            class526.method2841(-305539927, arg0.field8010, var5, class67.field815 == arg0, arg0.field8018, arg0.field451, arg0.field8011);
                        }
                        if (var5.field2441.length <= arg0.field451) {
                            if (var3.field7006) {
                                arg0.field417++;
                                arg0.field451 -= var5.field2453;
                                if (arg0.field417 >= var5.field2435) {
                                    arg0.field429 = -1;
                                } else if (arg0.field451 >= 0 && arg0.field451 < var5.field2441.length) {
                                    class526.method2841(-305539927, arg0.field8010, var5, class67.field815 == arg0, arg0.field8018, arg0.field451, arg0.field8011);
                                } else {
                                    arg0.field429 = -1;
                                }
                            } else {
                                arg0.field429 = -1;
                            }
                        }
                        arg0.field474 = arg0.field451 + 1;
                        if (arg0.field474 >= var5.field2441.length) {
                            if (var3.field7006) {
                                arg0.field474 -= var5.field2453;
                                if ((arg0.field417 + 1) >= var5.field2435) {
                                    arg0.field474 = -1;
                                } else if (arg0.field474 < 0 || var5.field2441.length <= arg0.field474) {
                                    arg0.field474 = -1;
                                }
                            } else {
                                arg0.field474 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field492 != -1 && arg0.field483 <= class665.field9027) {
            class561 var6 = class339.field4336.method2158((byte) -25, arg0.field492);
            int var7 = var6.field7016;
            if (var7 == -1) {
                arg0.field492 = -1;
            } else {
                label407: {
                    class207 var8 = class11.field110.method1141(var7, (byte) 109);
                    if (var6.field7006) {
                        if (var8.field2424 == 3) {
                            if (arg0.field506 > 0 && arg0.field470 <= class665.field9027 && class665.field9027 > arg0.field445) {
                                arg0.field492 = -1;
                                break label407;
                            }
                        } else if (var8.field2424 == 1 && arg0.field506 > 0 && class665.field9027 >= arg0.field470 && arg0.field445 < class665.field9027) {
                            arg0.field483 = class665.field9027 + 1;
                            break label407;
                        }
                    }
                    if (var8 == null || var8.field2441 == null) {
                        arg0.field492 = -1;
                    } else {
                        if (arg0.field438 < 0) {
                            arg0.field438 = 0;
                            class526.method2841(-305539927, arg0.field8010, var8, class67.field815 == arg0, arg0.field8018, 0, arg0.field8011);
                        }
                        arg0.field452++;
                        if (var8.field2441.length > arg0.field438 && arg0.field452 > var8.field2436[arg0.field438]) {
                            arg0.field438++;
                            arg0.field452 = 1;
                            class526.method2841(-305539927, arg0.field8010, var8, class67.field815 == arg0, arg0.field8018, arg0.field438, arg0.field8011);
                        }
                        if (var8.field2441.length <= arg0.field438) {
                            if (var6.field7006) {
                                arg0.field414++;
                                arg0.field438 -= var8.field2453;
                                if (arg0.field414 >= var8.field2435) {
                                    arg0.field492 = -1;
                                } else if (arg0.field438 >= 0 && var8.field2441.length > arg0.field438) {
                                    class526.method2841(-305539927, arg0.field8010, var8, class67.field815 == arg0, arg0.field8018, arg0.field438, arg0.field8011);
                                } else {
                                    arg0.field492 = -1;
                                }
                            } else {
                                arg0.field492 = -1;
                            }
                        }
                        arg0.field454 = arg0.field438 + 1;
                        if (var8.field2441.length <= arg0.field454) {
                            if (var6.field7006) {
                                arg0.field454 -= var8.field2453;
                                if (var8.field2435 <= (arg0.field414 + 1)) {
                                    arg0.field454 = -1;
                                } else if (arg0.field454 < 0 || arg0.field454 >= var8.field2441.length) {
                                    arg0.field454 = -1;
                                }
                            } else {
                                arg0.field454 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field447 != -1 && arg0.field472 <= 1) {
            class207 var9 = class11.field110.method1141(arg0.field447, (byte) -22);
            if (var9.field2424 == 3) {
                if (arg0.field506 > 0 && arg0.field470 <= class665.field9027 && arg0.field445 < class665.field9027) {
                    arg0.field447 = -1;
                    arg0.field448 = null;
                }
            } else if (var9.field2424 == 1 && arg0.field506 > 0 && class665.field9027 >= arg0.field470 && class665.field9027 > arg0.field445) {
                arg0.field472 = 2;
            }
        }
        if (arg0.field447 != -1 && arg0.field472 == 0) {
            class207 var10 = class11.field110.method1141(arg0.field447, (byte) -80);
            if (var10 == null || var10.field2441 == null) {
                arg0.field448 = null;
                arg0.field447 = -1;
            } else {
                arg0.field407++;
                if (var10.field2441.length > arg0.field478 && arg0.field407 > var10.field2436[arg0.field478]) {
                    arg0.field407 = 1;
                    arg0.field478++;
                    class526.method2841(-305539927, arg0.field8010, var10, class67.field815 == arg0, arg0.field8018, arg0.field478, arg0.field8011);
                }
                if (var10.field2441.length <= arg0.field478) {
                    arg0.field489++;
                    arg0.field478 -= var10.field2453;
                    if (var10.field2435 <= arg0.field489) {
                        arg0.field447 = -1;
                        arg0.field448 = null;
                    } else if (arg0.field478 >= 0 && arg0.field478 < var10.field2441.length) {
                        class526.method2841(-305539927, arg0.field8010, var10, class67.field815 == arg0, arg0.field8018, arg0.field478, arg0.field8011);
                    } else {
                        arg0.field447 = -1;
                        arg0.field448 = null;
                    }
                }
                arg0.field466 = arg0.field478 + 1;
                if (var10.field2441.length <= arg0.field466) {
                    arg0.field466 -= var10.field2453;
                    if ((arg0.field489 + 1) >= var10.field2435) {
                        arg0.field466 = -1;
                    } else if (arg0.field466 < 0 || var10.field2441.length <= arg0.field466) {
                        arg0.field466 = -1;
                    }
                }
                arg0.field435 = var10.field2429;
            }
        }
        if (arg0.field472 > 0) {
            arg0.field472--;
        }
        for (int var11 = 0; var11 < arg0.field418.length; var11++) {
            class78 var12 = arg0.field418[var11];
            if (var12 != null) {
                if (var12.field1011 > 0) {
                    var12.field1011--;
                } else {
                    class207 var13 = class11.field110.method1141(var12.field1014, (byte) -89);
                    if (var13 == null || var13.field2441 == null) {
                        arg0.field418[var11] = null;
                    } else {
                        var12.field1015++;
                        if (var13.field2441.length > var12.field1009 && var13.field2436[var12.field1009] < var12.field1015) {
                            var12.field1015 = 1;
                            var12.field1009++;
                            class526.method2841(-305539927, arg0.field8010, var13, class67.field815 == arg0, arg0.field8018, var12.field1009, arg0.field8011);
                        }
                        if (var12.field1009 >= var13.field2441.length) {
                            var12.field1013++;
                            var12.field1009 -= var13.field2453;
                            if (var13.field2435 <= var12.field1013) {
                                arg0.field418[var11] = null;
                            } else if (var12.field1009 >= 0 && var13.field2441.length > var12.field1009) {
                                class526.method2841(-305539927, arg0.field8010, var13, class67.field815 == arg0, arg0.field8018, var12.field1009, arg0.field8011);
                            } else {
                                arg0.field418[var11] = null;
                            }
                        }
                        var12.field1016 = var12.field1009 + 1;
                        if (var12.field1016 >= var13.field2441.length) {
                            var12.field1016 -= var13.field2453;
                            if ((var12.field1013 + 1) >= var13.field2435) {
                                var12.field1016 = -1;
                            } else if (var12.field1016 < 0 || var13.field2441.length <= var12.field1016) {
                                var12.field1016 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 487)
    public static void method2654(byte arg0) {
        field6106 = null;
        int var1 = 34 / ((-arg0 - 19) / 56);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)Lwu;", line = 497)
    public final class346 method2655(int arg0, byte arg1) {
        field6103++;
        byte[] var3 = this.field6101.method1659(111, arg0, 1);
        if (arg1 <= 26) {
            this.method2656(-41);
        }
        class346 var4 = new class346();
        var4.method2000(new class572(var3), 7680);
        return var4;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Z", line = 519)
    public final boolean method2656(int arg0) {
        field6102++;
        if (arg0 != 2359) {
            this.field6104 = null;
        }
        return this.field6099 != -1;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lbs;ILpfa;)V", line = 529)
    public class488(class643 arg0, int arg1, class275 arg2) {
        this.field6101 = arg2;
        this.field6101.method1655(1, (byte) -82);
        class572 var4 = new class572(this.field6101.method1659(109, 0, 0));
        int var5 = var4.method3097((byte) 12);
        if (var5 > 3) {
            this.field6105 = new int[0][];
            this.field6099 = -1;
            this.field6104 = new boolean[0];
        } else {
            int var6 = var4.method3097((byte) 12);
            class216[] var7 = class36.method237(22938);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3097((byte) 12);
                    if (var7[var9].field2531 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3097((byte) 12);
                int var12 = var4.method3097((byte) 12);
                if (var5 <= 2) {
                    this.field6099 = -1;
                } else {
                    this.field6099 = var4.method3086(65280);
                }
                this.field6105 = new int[var12 + 1][];
                this.field6104 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3097((byte) 12);
                    this.field6104[var15] = var4.method3097((byte) 12) == 1;
                    int var16 = var4.method3031(-1);
                    if (this.field6099 == -1) {
                        this.field6105[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6105[var15][var17] = var4.method3031(-1);
                        }
                    } else {
                        this.field6105[var15] = new int[var16 + 1];
                        this.field6105[var15][0] = this.field6099;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6105[var15][var18 + 1] = var4.method3031(-1);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field6105[var14] == null) {
                        if (this.field6099 == -1) {
                            this.field6105[var14] = new int[0];
                        } else {
                            this.field6105[var14] = new int[] { this.field6099 };
                        }
                    }
                }
            } else {
                this.field6104 = new boolean[0];
                this.field6099 = -1;
                this.field6105 = new int[0][];
            }
        }
    }
}
