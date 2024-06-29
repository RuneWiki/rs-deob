import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class440 extends class12 {

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    private int field6482 = 0;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "Lmt;")
    private class517 field6486 = new class517(16);

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
    private int field6489 = 0;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "Lfr;")
    private class497 field6488 = new class497();

    @OriginalMember(owner = "client!ws", name = "P", descriptor = "J")
    private long field6494 = 0L;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "Lur;")
    private class292 field6477;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    private int field6484;

    @OriginalMember(owner = "client!ws", name = "N", descriptor = "Z")
    private boolean field6492;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "Lfr;")
    private class497 field6490;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    private int field6466;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "Lcd;")
    private class65 field6483;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Liv;")
    private class289 field6471;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "Lur;")
    private class292 field6480;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
    private int field6478;

    @OriginalMember(owner = "client!ws", name = "O", descriptor = "Z")
    private boolean field6493;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "Lhh;")
    private class504 field6479;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field6460 = -60;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Leq;")
    private class508 field6474;

    @OriginalMember(owner = "client!ws", name = "M", descriptor = "Z")
    private boolean field6491;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "[B")
    private byte[] field6472;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)I", line = 3)
    public final int method2577(byte arg0) {
        field6463++;
        if (this.field6474 == null) {
            return 0;
        } else if (this.field6492) {
            class115 var2 = this.field6490.method2957(-55);
            if (arg0 <= 61) {
                this.field6482 = -68;
            }
            return var2 == null ? 0 : (int) var2.field1739;
        } else {
            return this.field6474.field7471;
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V", line = 35)
    public static final void method2578(byte arg0) {
        field6465++;
        if (arg0 <= 96) {
            field6460 = 34;
        }
        class376 var1 = (class376) class483.field7130.method2957(99);
        boolean var2 = class251.field3435 != null || class9.field88 > 0;
        if (var2) {
            class36.field496 = 1;
        }
        if (class80.field1107 && class49.field630.method1879(81, true) && class448.field6610 > 2) {
            if (var2) {
                class521.field7664 = (class477) class154.field2334.field7365.field1736.field1736;
            } else {
                class101.method771(var1.method954(3), (byte) 112, (class477) class154.field2334.field7365.field1736.field1736, var1.method952(25407));
            }
        } else if (var2) {
            class521.field7664 = (class477) class154.field2334.field7365.field1736;
        } else {
            class101.method771(var1.method954(3), (byte) 112, (class477) class154.field2334.field7365.field1736, var1.method952(25407));
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V", line = 70)
    public final void method2579(int arg0) {
        field6470++;
        if (this.field6490 == null || this.method167(0) == null) {
            return;
        }
        for (class115 var2 = this.field6488.method2957(124); var2 != null; var2 = this.field6488.method2947(-72)) {
            int var3 = (int) var2.field1739;
            if (var3 < 0 || var3 >= this.field6474.field7455 || this.field6474.field7463[var3] == 0) {
                var2.method876((byte) -96);
            } else {
                if (this.field6472[var3] == 0) {
                    this.method2585(1, var3, -93);
                }
                if (this.field6472[var3] == -1) {
                    this.method2585(2, var3, 81);
                }
                if (this.field6472[var3] == 1) {
                    var2.method876((byte) -96);
                }
            }
        }
        if (arg0 >= -53) {
            this.field6484 = -115;
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)I", line = 114)
    public final int method2580(int arg0) {
        if (arg0 != 30892) {
            this.field6483 = null;
        }
        field6468++;
        if (this.method167(0) == null) {
            return this.field6479 == null ? 0 : this.field6479.method680(126);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(BI)V", line = 135)
    public final void method168(byte arg0, int arg1) {
        field6464++;
        if (this.field6477 == null) {
            return;
        }
        for (class115 var3 = this.field6488.method2957(-112); var3 != null; var3 = this.field6488.method2947(-73)) {
            if ((long) arg1 == var3.field1739) {
                return;
            }
        }
        int var4 = -32 / ((-arg0 - 16) / 62);
        class115 var5 = new class115();
        var5.field1739 = arg1;
        this.field6488.method2958(var5, (byte) 55);
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)I", line = 165)
    public final int method2581(int arg0) {
        field6461++;
        if (arg0 != 6670) {
            this.method2580(-50);
        }
        return this.field6482;
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)I", line = 176)
    public final int method2582(int arg0) {
        if (arg0 != 0) {
            this.field6479 = null;
        }
        field6462++;
        return this.field6474 == null ? 0 : this.field6474.field7471;
    }

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "(I)V", line = 193)
    public final void method2583(int arg0) {
        field6487++;
        if (this.field6477 == null) {
            return;
        }
        if (arg0 != -13122) {
            this.method2577((byte) -35);
        }
        this.field6491 = true;
        if (this.field6490 == null) {
            this.field6490 = new class497();
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Leq;", line = 216)
    public final class508 method167(int arg0) {
        if (arg0 != 0) {
            this.field6466 = 100;
        }
        field6481++;
        if (this.field6474 != null) {
            return this.field6474;
        }
        if (this.field6479 == null) {
            if (this.field6471.method1794((byte) -1)) {
                return null;
            }
            this.field6479 = this.field6471.method1796(255, this.field6484, -51, true, (byte) 0);
        }
        if (this.field6479.field7421) {
            return null;
        }
        byte[] var2 = this.field6479.method682(-122);
        if (this.field6479 instanceof class86) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6474 = new class508(var2, this.field6466);
                if (this.field6474.field7460 != this.field6478) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6474 = null;
                if (this.field6471.method1794((byte) -1)) {
                    this.field6479 = null;
                } else {
                    this.field6479 = this.field6471.method1796(255, this.field6484, arg0 - 94, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6474 = new class508(var2, this.field6466);
            } catch (RuntimeException var4) {
                this.field6471.method1797(127);
                this.field6474 = null;
                if (this.field6471.method1794((byte) -1)) {
                    this.field6479 = null;
                } else {
                    this.field6479 = this.field6471.method1796(255, this.field6484, -64, true, (byte) 0);
                }
                return null;
            }
            if (this.field6480 != null) {
                this.field6483.method457(this.field6480, var2, this.field6484, (byte) 94);
            }
        }
        if (this.field6477 != null) {
            this.field6472 = new byte[this.field6474.field7455];
            this.field6482 = 0;
        }
        this.field6479 = null;
        return this.field6474;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[B", line = 310)
    public final byte[] method163(int arg0, int arg1) {
        field6476++;
        class504 var3 = this.method2585(arg0, arg1, -52);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method682(-108);
            var3.method876((byte) -96);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)I", line = 328)
    public final int method166(byte arg0, int arg1) {
        if (arg0 != 14) {
            this.method163(8, 10);
        }
        field6475++;
        class504 var3 = (class504) this.field6486.method3059(45, (long) arg1);
        return var3 == null ? 0 : var3.method680(arg0 ^ 0xFFFFFFC0);
    }

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "(I)V", line = 355)
    public final void method2584(int arg0) {
        int var2 = -58 / ((-arg0 - 7) / 63);
        field6485++;
        if (this.field6490 != null) {
            if (this.method167(0) == null) {
                return;
            }
            if (this.field6492) {
                boolean var3 = true;
                for (class115 var4 = this.field6490.method2957(89); var4 != null; var4 = this.field6490.method2947(48)) {
                    int var6 = (int) var4.field1739;
                    if (this.field6472[var6] == 0) {
                        this.method2585(1, var6, 90);
                    }
                    if (this.field6472[var6] == 0) {
                        var3 = false;
                    } else {
                        var4.method876((byte) -96);
                    }
                }
                while (this.field6489 < this.field6474.field7463.length) {
                    if (this.field6474.field7463[this.field6489] == 0) {
                        this.field6489++;
                    } else {
                        if (this.field6483.field882 >= 250) {
                            var3 = false;
                            break;
                        }
                        if (this.field6472[this.field6489] == 0) {
                            this.method2585(1, this.field6489, 60);
                        }
                        if (this.field6472[this.field6489] == 0) {
                            class115 var5 = new class115();
                            var5.field1739 = this.field6489;
                            var3 = false;
                            this.field6490.method2958(var5, (byte) 63);
                        }
                        this.field6489++;
                    }
                }
                if (var3) {
                    this.field6492 = false;
                    this.field6489 = 0;
                }
            } else if (this.field6491) {
                boolean var7 = true;
                for (class115 var8 = this.field6490.method2957(88); var8 != null; var8 = this.field6490.method2947(54)) {
                    int var10 = (int) var8.field1739;
                    if (this.field6472[var10] != 1) {
                        this.method2585(2, var10, 117);
                    }
                    if (this.field6472[var10] == 1) {
                        var8.method876((byte) -96);
                    } else {
                        var7 = false;
                    }
                }
                while (this.field6489 < this.field6474.field7463.length) {
                    if (this.field6474.field7463[this.field6489] == 0) {
                        this.field6489++;
                    } else {
                        if (this.field6471.method1789((byte) -111)) {
                            var7 = false;
                            break;
                        }
                        if (this.field6472[this.field6489] != 1) {
                            this.method2585(2, this.field6489, 124);
                        }
                        if (this.field6472[this.field6489] != 1) {
                            class115 var9 = new class115();
                            var9.field1739 = this.field6489;
                            var7 = false;
                            this.field6490.method2958(var9, (byte) 112);
                        }
                        this.field6489++;
                    }
                }
                if (var7) {
                    this.field6491 = false;
                    this.field6489 = 0;
                }
            } else {
                this.field6490 = null;
            }
        }
        if (!this.field6493 || this.field6494 > class381.method2281((byte) 104)) {
            return;
        }
        for (class504 var11 = (class504) this.field6486.method3061(-16817); var11 != null; var11 = (class504) this.field6486.method3066((byte) 126)) {
            if (!var11.field7421) {
                if (var11.field7417) {
                    if (!var11.field7419) {
                        throw new RuntimeException();
                    }
                    var11.method876((byte) -96);
                } else {
                    var11.field7417 = true;
                }
            }
        }
        this.field6494 = class381.method2281((byte) 78) + 1000L;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Lhh;", line = 528)
    private final class504 method2585(int arg0, int arg1, int arg2) {
        field6473++;
        int var4 = 2 / ((-arg2 - 3) / 33);
        class504 var5 = (class504) this.field6486.method3059(91, (long) arg1);
        if (var5 != null && arg0 == 0 && !var5.field7419 && var5.field7421) {
            var5.method876((byte) -96);
            var5 = null;
        }
        if (var5 == null) {
            if (arg0 == 0) {
                if (this.field6477 == null || this.field6472[arg1] == -1) {
                    if (this.field6471.method1794((byte) -1)) {
                        return null;
                    }
                    var5 = this.field6471.method1796(this.field6484, arg1, -36, true, (byte) 2);
                } else {
                    var5 = this.field6483.method459(this.field6477, (byte) -125, arg1);
                }
            } else if (arg0 == 1) {
                if (this.field6477 == null) {
                    throw new RuntimeException();
                }
                var5 = this.field6483.method456(arg1, this.field6477, (byte) -55);
            } else if (arg0 == 2) {
                if (this.field6477 == null) {
                    throw new RuntimeException();
                }
                if (this.field6472[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6471.method1789((byte) -111)) {
                    return null;
                }
                var5 = this.field6471.method1796(this.field6484, arg1, -80, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field6486.method3055(0, (long) arg1, var5);
        }
        if (var5.field7421) {
            return null;
        }
        byte[] var6 = var5.method682(114);
        if (!var5 instanceof class86) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class482.field7122.reset();
                class482.field7122.update(var6, 0, var6.length - 2);
                int var7 = (int) class482.field7122.getValue();
                if (this.field6474.field7468[arg1] != var7) {
                    throw new RuntimeException();
                }
                this.field6471.field4345 = 0;
                this.field6471.field4346 = 0;
            } catch (RuntimeException var13) {
                this.field6471.method1797(-35);
                var5.method876((byte) -96);
                if (var5.field7419 && !this.field6471.method1794((byte) -1)) {
                    class274 var8 = this.field6471.method1796(this.field6484, arg1, -117, true, (byte) 2);
                    this.field6486.method3055(0, (long) arg1, var8);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field6474.field7467[arg1] >>> 8);
            var6[var6.length - 1] = (byte) this.field6474.field7467[arg1];
            if (this.field6477 != null) {
                this.field6483.method457(this.field6477, var6, arg1, (byte) -84);
                if (this.field6472[arg1] != 1) {
                    this.field6482++;
                    this.field6472[arg1] = 1;
                }
            }
            if (!var5.field7419) {
                var5.method876((byte) -96);
            }
            return var5;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class482.field7122.reset();
            class482.field7122.update(var6, 0, var6.length - 2);
            int var9 = (int) class482.field7122.getValue();
            if (this.field6474.field7468[arg1] != var9) {
                throw new RuntimeException();
            }
            int var10 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field6474.field7467[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field6472[arg1] != 1) {
                this.field6482++;
                this.field6472[arg1] = 1;
            }
            if (!var5.field7419) {
                var5.method876((byte) -96);
            }
            return var5;
        } catch (Exception var12) {
            this.field6472[arg1] = -1;
            var5.method876((byte) -96);
            if (var5.field7419 && !this.field6471.method1794((byte) -1)) {
                class274 var11 = this.field6471.method1796(this.field6484, arg1, -77, true, (byte) 2);
                this.field6486.method3055(0, (long) arg1, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "(I)V", line = 747)
    public static final void method2586(int arg0) {
        field6467++;
        int var1 = class454.field6661.method1534(class113.field1723, (byte) 124);
        if (arg0 != -2) {
            field6460 = 126;
        }
        if (var1 == 0) {
            class274.field4082 = null;
            class69.method483((byte) -25, 0);
        } else if (var1 == 1) {
            class51.method379((byte) 0, (byte) -57);
            class69.method483((byte) -25, 512);
            if (class524.field7736 != null) {
                class154.method1111(0);
            }
        } else {
            class51.method379((byte) (class439.field6459 - 4 & 0xFF), (byte) -120);
            class69.method483((byte) -25, 2);
        }
        class289.field4340 = class521.field7651;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(ILur;Lur;Liv;Lcd;IIZ)V", line = 814)
    public class440(int arg0, class292 arg1, class292 arg2, class289 arg3, class65 arg4, int arg5, int arg6, boolean arg7) {
        this.field6477 = arg1;
        this.field6484 = arg0;
        if (this.field6477 == null) {
            this.field6492 = false;
        } else {
            this.field6492 = true;
            this.field6490 = new class497();
        }
        this.field6466 = arg5;
        this.field6483 = arg4;
        this.field6471 = arg3;
        this.field6480 = arg2;
        this.field6478 = arg6;
        this.field6493 = arg7;
        if (this.field6480 != null) {
            this.field6479 = this.field6483.method459(this.field6480, (byte) -124, this.field6484);
        }
    }
}
