import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class94 extends class294 {

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "[I")
    private int[] field1359 = new int[this.field4615];

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[B")
    private byte[] field1349;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 7)
    public final void method739(int arg0, int arg1, int arg2) {
        field1355++;
        if (arg2 != 1858111180) {
            this.field1359 = (int[]) null;
        }
        this.field1357 += this.field1359[arg0] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V", line = 23)
    public void method740(int arg0, byte arg1) {
        this.field1349[this.field1356++] = (byte) (class142.method1078(127, arg1 >> 1) + 127);
        field1358++;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)Z", line = 36)
    public static final boolean method741(byte arg0) {
        field1352++;
        try {
            if (class41.field616 == 2) {
                if (class235.field3603 == null) {
                    class235.field3603 = class172.method1257(class276.field4244, class133.field2099, class128.field2024);
                    if (class235.field3603 == null) {
                        return false;
                    }
                }
                if (class308.field4801 == null) {
                    class308.field4801 = new class115(class4.field24, class96.field1421);
                }
                if (class213.field3383.method837(73, class235.field3603, class308.field4801, 22050, class288.field4531)) {
                    class213.field3383.method870(true);
                    class213.field3383.method841(-6260, class96.field1428);
                    class213.field3383.method862(false, class6.field60, class235.field3603);
                    class41.field616 = 0;
                    class308.field4801 = null;
                    class235.field3603 = null;
                    class276.field4244 = null;
                    return true;
                }
            }
            if (arg0 != 72) {
                method741((byte) 77);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class213.field3383.method850(-10531);
            class308.field4801 = null;
            class235.field3603 = null;
            class41.field616 = 0;
            class276.field4244 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 92)
    public final void method742(byte arg0) {
        this.field1357 = 0;
        if (arg0 < 60) {
            this.field1349 = (byte[]) null;
        }
        field1354++;
        this.field1356 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIZ)V", line = 108)
    public static final void method743(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class212.field3361 = 0L;
        int var5 = class76.method613((byte) 94);
        if (arg0 == 3 || var5 == 3) {
            arg4 = true;
        }
        field1350++;
        boolean var6 = false;
        if (class26.field294.startsWith("mac") && arg0 > 0) {
            arg4 = true;
        }
        if (var5 <= 0 == arg0 > 0) {
            var6 = true;
        }
        if (arg2 >= 107) {
            if (arg4 && arg0 > 0) {
                var6 = true;
            }
            class201.method1457((byte) -85, var6, arg1, var5, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIF)V", line = 137)
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4615; var7++) {
            this.field1359[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)V", line = 156)
    public static final void method744(byte arg0) {
        field1353++;
        if (class242.field3637 == 0 || class242.field3637 == 5) {
            return;
        }
        try {
            if (arg0 != -10) {
                return;
            }
            if ((++class137.field2128) > 2000) {
                if (class297.field4661 != null) {
                    class297.field4661.method916(-25224);
                    class297.field4661 = null;
                }
                if (class99.field1463 >= 1) {
                    class311.field4847 = -5;
                    class242.field3637 = 0;
                    return;
                }
                class99.field1463++;
                if (class208.field3276 == class196.field3101) {
                    class208.field3276 = class4.field20;
                } else {
                    class208.field3276 = class196.field3101;
                }
                class242.field3637 = 1;
                class137.field2128 = 0;
            }
            if (class242.field3637 == 1) {
                class183.field2747 = class301.field4715.method162(class208.field3276, (byte) -117, class255.field3816);
                class242.field3637 = 2;
            }
            if (class242.field3637 == 2) {
                if (class183.field2747.field3585 == 2) {
                    throw new IOException();
                }
                if (class183.field2747.field3585 != 1) {
                    return;
                }
                class297.field4661 = new class118((Socket) class183.field2747.field3590, class301.field4715);
                class183.field2747 = null;
                long var1 = class141.field2182 = class224.method1597(true, class190.field3039);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class159.field2372.field455 = 0;
                class159.field2372.method262((byte) 81, 14);
                class159.field2372.method262((byte) 81, var3);
                class297.field4661.method920((byte) -76, class159.field2372.field437, 0, 2);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 35);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 23);
                }
                int var4 = class297.field4661.method918(arg0 + 10);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 40);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 125);
                }
                if (var4 != 0) {
                    class242.field3637 = 0;
                    class311.field4847 = var4;
                    class297.field4661.method916(-25224);
                    class297.field4661 = null;
                    return;
                }
                class242.field3637 = 3;
            }
            if (class242.field3637 == 3) {
                if (class297.field4661.method915(arg0 + 10) < 8) {
                    return;
                }
                class297.field4661.method919(8, class88.field1293.field437, 10224, 0);
                class88.field1293.field455 = 0;
                int[] var5 = new int[4];
                class228.field3536 = class88.field1293.method289((byte) 126);
                var5[2] = (int) (class228.field3536 >> 32);
                var5[3] = (int) class228.field3536;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class159.field2372.field455 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class159.field2372.method262((byte) 81, 10);
                class159.field2372.method259(-15195, var5[0]);
                class159.field2372.method259(-15195, var5[1]);
                class159.field2372.method259(-15195, var5[2]);
                class159.field2372.method259(-15195, var5[3]);
                class159.field2372.method261(1523335144, class224.method1597(true, class190.field3039));
                class159.field2372.method277(class67.field989, 4773);
                class159.field2372.method302((byte) 70, class77.field1078, class49.field764);
                class136.field2122.field455 = 0;
                if (class305.field4771 == 40) {
                    class136.field2122.method262((byte) 81, 18);
                } else {
                    class136.field2122.method262((byte) 81, 16);
                }
                class136.field2122.method263(class159.field2372.field455 + class206.method1473((byte) -92, class287.field4426) + 159, (byte) 110);
                class136.field2122.method259(-15195, 532);
                class136.field2122.method262((byte) 81, class162.field2409);
                class136.field2122.method262((byte) 81, class212.field3367 ? 1 : 0);
                class136.field2122.method262((byte) 81, 1);
                class136.field2122.method262((byte) 81, class76.method613((byte) 109));
                class136.field2122.method263(class125.field1972, (byte) 103);
                class136.field2122.method263(class210.field3314, (byte) 107);
                class136.field2122.method262((byte) 81, class117.field1834);
                class149.method1107(class136.field2122, (byte) -119);
                class136.field2122.method277(class287.field4426, arg0 ^ 0xFFFFED53);
                class136.field2122.method259(-15195, class317.field4923);
                class136.field2122.method259(-15195, class51.method471(false));
                class253.field3771 = true;
                class136.field2122.method263(class291.field4570, (byte) 101);
                class136.field2122.method259(-15195, class260.field3854.method1509(false));
                class136.field2122.method259(arg0 - 15185, class154.field2325.method1509(false));
                class136.field2122.method259(-15195, class301.field4719.method1509(false));
                class136.field2122.method259(-15195, class248.field3724.method1509(false));
                class136.field2122.method259(-15195, class232.field3582.method1509(false));
                class136.field2122.method259(-15195, class246.field3710.method1509(false));
                class136.field2122.method259(-15195, class178.field2663.method1509(false));
                class136.field2122.method259(-15195, class302.field4728.method1509(false));
                class136.field2122.method259(-15195, class80.field1118.method1509(false));
                class136.field2122.method259(-15195, class17.field203.method1509(false));
                class136.field2122.method259(arg0 ^ 0x3B53, class154.field2322.method1509(false));
                class136.field2122.method259(-15195, class136.field2123.method1509(false));
                class136.field2122.method259(-15195, class133.field2098.method1509(false));
                class136.field2122.method259(-15195, class51.field786.method1509(false));
                class136.field2122.method259(arg0 ^ 0x3B53, class282.field4357.method1509(false));
                class136.field2122.method259(-15195, class14.field158.method1509(false));
                class136.field2122.method259(-15195, class86.field1263.method1509(false));
                class136.field2122.method259(-15195, class299.field4708.method1509(false));
                class136.field2122.method259(-15195, class322.field5011.method1509(false));
                class136.field2122.method259(-15195, class205.field3249.method1509(false));
                class136.field2122.method259(arg0 ^ 0x3B53, class17.field204.method1509(false));
                class136.field2122.method259(-15195, class51.field794.method1509(false));
                class136.field2122.method259(-15195, class301.field4717.method1509(false));
                class136.field2122.method259(arg0 - 15185, class220.field3451.method1509(false));
                class136.field2122.method259(-15195, class319.field4974.method1509(false));
                class136.field2122.method259(-15195, class291.field4574.method1509(false));
                class136.field2122.method259(-15195, class279.field4295.method1509(false));
                class136.field2122.method259(-15195, class125.field1967.method1509(false));
                class136.field2122.method278(0, class159.field2372.field455, (byte) 24, class159.field2372.field437);
                class297.field4661.method920((byte) -76, class136.field2122.field437, 0, class136.field2122.field455);
                class159.field2372.method60(-75, var5);
                int var6 = 0;
                while (true) {
                    if (var6 >= 4) {
                        class88.field1293.method60(-122, var5);
                        class242.field3637 = 4;
                        break;
                    }
                    var5[var6] += 50;
                    var6++;
                }
            }
            if (class242.field3637 == 4) {
                if (class297.field4661.method915(0) < 1) {
                    return;
                }
                int var7 = class297.field4661.method918(0);
                if (var7 == 21) {
                    class242.field3637 = 7;
                } else if (var7 == 29) {
                    class242.field3637 = 10;
                } else if (var7 == 1) {
                    class311.field4847 = var7;
                    class242.field3637 = 5;
                    return;
                } else if (var7 == 2) {
                    class242.field3637 = 8;
                } else if (var7 == 15) {
                    class311.field4847 = var7;
                    class242.field3637 = 0;
                    return;
                } else if (var7 == 23 && class99.field1463 < 1) {
                    class99.field1463++;
                    class137.field2128 = 0;
                    class242.field3637 = 1;
                    class297.field4661.method916(-25224);
                    class297.field4661 = null;
                    return;
                } else {
                    class311.field4847 = var7;
                    class242.field3637 = 0;
                    class297.field4661.method916(arg0 - 25214);
                    class297.field4661 = null;
                    return;
                }
            }
            if (class242.field3637 == 6) {
                class159.field2372.field455 = 0;
                class159.field2372.method59(17, (byte) 73);
                class297.field4661.method920((byte) -76, class159.field2372.field437, 0, class159.field2372.field455);
                class242.field3637 = 4;
                return;
            }
            if (class242.field3637 == 7) {
                if (class297.field4661.method915(0) >= 1) {
                    class179.field2677 = class297.field4661.method918(arg0 + 10) * 60 + 180;
                    class242.field3637 = 0;
                    class311.field4847 = 21;
                    class297.field4661.method916(-25224);
                    class297.field4661 = null;
                    return;
                }
                return;
            }
            if (class242.field3637 == 10) {
                if (class297.field4661.method915(0) < 1) {
                    return;
                }
                class136.field2124 = class297.field4661.method918(arg0 + 10);
                class242.field3637 = 0;
                class311.field4847 = 29;
                class297.field4661.method916(-25224);
                class297.field4661 = null;
                return;
            }
            if (class242.field3637 == 8) {
                if (class297.field4661.method915(0) < 14) {
                    return;
                }
                class297.field4661.method919(14, class88.field1293.field437, 10224, 0);
                class88.field1293.field455 = 0;
                class287.field4421 = class88.field1293.method273(arg0 + 65290);
                class205.field3250 = class88.field1293.method273(arg0 + 65290);
                class319.field4965 = class88.field1293.method273(65280) == 1;
                class209.field3295 = class88.field1293.method273(65280) == 1;
                class37.field555 = class88.field1293.method273(65280) == 1;
                class238.field3622 = class88.field1293.method273(arg0 ^ 0xFFFF00F6) == 1;
                class117.field1829 = class88.field1293.method273(65280) == 1;
                class196.field3111 = class88.field1293.method300(-1394191632);
                class184.field2938 = class88.field1293.method273(65280) == 1;
                class43.field674 = class88.field1293.method273(65280) == 1;
                class35.method285(-25, class43.field674);
                class199.method1446((byte) 105, class43.field674);
                if (!class212.field3367) {
                    if ((!class319.field4965 || class37.field555) && !class184.field2938) {
                        try {
                            class226.method1607(class301.field4715.field285, true, "unzap");
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class226.method1607(class301.field4715.field285, true, "zap");
                        } catch (Throwable var12) {
                        }
                    }
                }
                class138.field2146 = class88.field1293.method67(true);
                class79.field1112 = class88.field1293.method300(-1394191632);
                class242.field3637 = 9;
            }
            if (class242.field3637 == 9) {
                if (class297.field4661.method915(arg0 ^ 0xFFFFFFF6) >= class79.field1112) {
                    class88.field1293.field455 = 0;
                    class297.field4661.method919(class79.field1112, class88.field1293.field437, 10224, 0);
                    class242.field3637 = 0;
                    class311.field4847 = 2;
                    class190.method1371(arg0 ^ 0xFFFFFFF6);
                    class263.field3940 = -1;
                    class81.method635(false, true);
                    class138.field2146 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class297.field4661 != null) {
                class297.field4661.method916(-25224);
                class297.field4661 = null;
            }
            if (class99.field1463 >= 1) {
                class311.field4847 = -4;
                class242.field3637 = 0;
            } else {
                class242.field3637 = 1;
                if (class208.field3276 == class196.field3101) {
                    class208.field3276 = class4.field20;
                } else {
                    class208.field3276 = class196.field3101;
                }
                class99.field1463++;
                class137.field2128 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V", line = 533)
    public final void method745(byte arg0) {
        this.field1357 = Math.abs(this.field1357);
        if (arg0 != 107) {
            this.field1349 = (byte[]) null;
        }
        field1351++;
        if (this.field1357 >= 4096) {
            this.field1357 = 4095;
        }
        this.method740(this.field1356++, (byte) (this.field1357 >> 4));
        this.field1357 = 0;
    }
}
