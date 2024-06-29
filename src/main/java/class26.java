import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class26 {

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lu;")
    private class219 field356 = new class219();

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lu;")
    private class219 field361 = new class219();

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "Lu;")
    private class219 field362 = new class219();

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Lu;")
    private class219 field363 = new class219();

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "Lhb;")
    private class164 field366 = new class164(4);

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public volatile int field368 = 0;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "B")
    private byte field370 = 0;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public volatile int field369 = 0;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "Lhb;")
    private class164 field371 = new class164(8);

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lph;")
    public static class229 field348 = class266.method1858(" GMT", 0);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lph;")
    public static class229 field346 = class266.method1858("Lade)3)3)3", 0);

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Lph;")
    public static class229 field357 = class266.method1858("::wm2", 0);

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Z")
    public static boolean field360 = false;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "J")
    private long field365;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "Lli;")
    private class243 field372;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "Lec;")
    private class67 field364;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lfd;")
    public static class68 field344;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 4)
    public static void method163(byte arg0) {
        field357 = null;
        field348 = null;
        field344 = null;
        if (arg0 != 64) {
            method177(81, (class229) null, -21, (class229) null, (class229) null);
        }
        field346 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 17)
    public final void method164(int arg0) {
        if (arg0 != -2) {
            this.method175(112);
        }
        field358++;
        if (this.field364 != null) {
            this.field364.method534(-1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 31)
    public final void method165(int arg0) {
        field351++;
        try {
            this.field364.method534(-1);
        } catch (Exception var3) {
        }
        if (arg0 <= 6) {
            this.field367 = 107;
        }
        this.field370 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field364 = null;
        this.field369 = -1;
        this.field368++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIBI)Lli;", line = 50)
    public final class243 method166(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        field349++;
        if (arg2 != 20) {
            this.field371 = (class164) null;
        }
        long var6 = (long) ((arg4 << 16) + arg1);
        class243 var8 = new class243();
        var8.field468 = var6;
        var8.field727 = arg0;
        var8.field4007 = arg3;
        if (arg0) {
            if (this.method174((byte) 72) >= 20) {
                throw new RuntimeException();
            }
            this.field356.method1532(124, var8);
        } else if (this.method168(true) < 20) {
            this.field362.method1532(122, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z", line = 93)
    public final boolean method167(byte arg0) {
        if (arg0 < 105) {
            field348 = (class229) null;
        }
        field341++;
        return this.method174((byte) 72) >= 20;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I", line = 110)
    private final int method168(boolean arg0) {
        field345++;
        if (!arg0) {
            field357 = (class229) null;
        }
        return this.field362.method1528(0) + this.field363.method1528(0);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)Z", line = 122)
    public final boolean method169(int arg0) {
        if (this.field364 != null) {
            long var2 = class130.method935(false);
            int var4 = (int) (var2 - this.field365);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field367 += var4;
            this.field365 = var2;
            if (this.field367 > 30000) {
                try {
                    this.field364.method534(-1);
                } catch (Exception var30) {
                }
                this.field364 = null;
            }
        }
        field343++;
        if (this.field364 == null) {
            return this.method174((byte) 72) == 0 && this.method168(true) == 0;
        }
        try {
            this.field364.method530(true);
            if (arg0 != 1) {
                this.field372 = (class243) null;
            }
            for (class243 var6 = (class243) this.field356.method1529((byte) 0); var6 != null; var6 = (class243) this.field356.method1533(3)) {
                this.field366.field2670 = 0;
                this.field366.method1188(-116, 1);
                this.field366.method1204((byte) 123, (int) var6.field468);
                this.field364.method527(this.field366.field2668, arg0 ^ 0x5100, 4, 0);
                this.field361.method1532(124, var6);
            }
            for (class243 var7 = (class243) this.field362.method1529((byte) 0); var7 != null; var7 = (class243) this.field362.method1533(arg0 ^ 0x2)) {
                this.field366.field2670 = 0;
                this.field366.method1188(-82, 0);
                this.field366.method1204((byte) 102, (int) var7.field468);
                this.field364.method527(this.field366.field2668, 20737, 4, 0);
                this.field363.method1532(arg0 ^ 0x7F, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field364.method525(false);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field367 = 0;
                byte var10 = 0;
                if (this.field372 == null) {
                    var10 = 8;
                } else if (this.field372.field4008 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field372.field4002.field2668.length - this.field372.field4007;
                    int var12 = 512 - this.field372.field4008;
                    if (var11 - this.field372.field4002.field2670 < var12) {
                        var12 = var11 - this.field372.field4002.field2670;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field364.method532(false, var12, this.field372.field4002.field2670, this.field372.field4002.field2668);
                    if (this.field370 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field372.field4002.field2668[this.field372.field4002.field2670 + var13] = (byte) class101.method775(this.field372.field4002.field2668[this.field372.field4002.field2670 + var13], this.field370);
                        }
                    }
                    this.field372.field4002.field2670 += var12;
                    this.field372.field4008 += var12;
                    if (this.field372.field4002.field2670 == var11) {
                        this.field372.method224(128);
                        this.field372.field725 = false;
                        this.field372 = null;
                    } else if (this.field372.field4008 == 512) {
                        this.field372.field4008 = 0;
                    }
                } else {
                    int var14 = var10 - this.field371.field2670;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field364.method532(false, var14, this.field371.field2670, this.field371.field2668);
                    if (this.field370 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field371.field2668[this.field371.field2670 + var15] = (byte) class101.method775(this.field371.field2668[this.field371.field2670 + var15], this.field370);
                        }
                    }
                    this.field371.field2670 += var14;
                    if (var10 <= this.field371.field2670) {
                        if (this.field372 == null) {
                            this.field371.field2670 = 0;
                            int var16 = this.field371.method1178(8);
                            int var17 = this.field371.method1161(true);
                            int var18 = this.field371.method1178(8);
                            int var19 = this.field371.method1191(31776);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class243 var25;
                            if (var21) {
                                for (var25 = (class243) this.field363.method1529((byte) 0); var25 != null && var25.field468 != var22; var25 = (class243) this.field363.method1533(arg0 + 2)) {
                                }
                            } else {
                                for (var25 = (class243) this.field361.method1529((byte) 0); var25 != null && var25.field468 != var22; var25 = (class243) this.field361.method1533(3)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field372 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field372.field4002 = new class164(this.field372.field4007 + var19 + var26);
                            this.field372.field4002.method1188(arg0 ^ 0xFFFFFFB5, var20);
                            this.field372.field4002.method1168(var19, (byte) -121);
                            this.field371.field2670 = 0;
                            this.field372.field4008 = 8;
                        } else if (this.field372.field4008 != 0) {
                            throw new IOException();
                        } else if (this.field371.field2668[0] == -1) {
                            this.field372.field4008 = 1;
                            this.field371.field2670 = 0;
                        } else {
                            this.field372 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field364.method534(-1);
            } catch (Exception var29) {
            }
            this.field364 = null;
            this.field368++;
            this.field369 = -2;
            return this.method174((byte) 72) == 0 && this.method168(true) == 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 394)
    public final void method170(int arg0) {
        if (arg0 != 512) {
            this.method164(73);
        }
        field352++;
        if (this.field364 == null) {
            return;
        }
        try {
            this.field366.field2670 = 0;
            this.field366.method1188(arg0 ^ 0xFFFFFD91, 7);
            this.field366.method1204((byte) 61, 0);
            this.field364.method527(this.field366.field2668, 20737, 4, 0);
        } catch (IOException var5) {
            try {
                this.field364.method534(arg0 - 513);
            } catch (Exception var4) {
            }
            this.field368++;
            this.field364 = null;
            this.field369 = -2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 422)
    public final void method171(int arg0) {
        if (this.field364 != null) {
            this.field364.method531(-118);
        }
        if (arg0 > 28) {
            field350++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V", line = 437)
    private final void method172(byte arg0) {
        field347++;
        if (this.field364 == null) {
            return;
        }
        try {
            this.field366.field2670 = 0;
            this.field366.method1188(-92, 6);
            if (arg0 != 59) {
                return;
            }
            this.field366.method1204((byte) 113, 3);
            this.field364.method527(this.field366.field2668, 20737, 4, 0);
        } catch (IOException var5) {
            try {
                this.field364.method534(-1);
            } catch (Exception var4) {
            }
            this.field364 = null;
            this.field368++;
            this.field369 = -2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lec;IZ)V", line = 465)
    public final void method173(class67 arg0, int arg1, boolean arg2) {
        field342++;
        if (this.field364 != null) {
            try {
                this.field364.method534(-1);
            } catch (Exception var11) {
            }
            this.field364 = null;
        }
        this.field364 = arg0;
        this.method172((byte) 59);
        this.method178((byte) 62, arg2);
        this.field371.field2670 = 0;
        this.field372 = null;
        while (true) {
            class243 var5 = (class243) this.field361.method1536((byte) 116);
            if (var5 == null) {
                while (true) {
                    class243 var6 = (class243) this.field363.method1536((byte) 116);
                    if (var6 == null) {
                        if (this.field370 != 0) {
                            try {
                                this.field366.field2670 = 0;
                                this.field366.method1188(-81, 4);
                                this.field366.method1188(-101, this.field370);
                                this.field366.method1155(arg1 - 1640531527, 0);
                                this.field364.method527(this.field366.field2668, 20737, 4, 0);
                            } catch (IOException var10) {
                                try {
                                    this.field364.method534(arg1 - 1);
                                } catch (Exception var9) {
                                }
                                this.field369 = -2;
                                this.field364 = null;
                                this.field368++;
                            }
                        }
                        this.field367 = arg1;
                        this.field365 = class130.method935(false);
                        return;
                    }
                    this.field362.method1532(114, var6);
                }
            }
            this.field356.method1532(124, var5);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)I", line = 531)
    public final int method174(byte arg0) {
        field339++;
        if (arg0 != 72) {
            field348 = (class229) null;
        }
        return this.field356.method1528(arg0 ^ 0x48) + this.field361.method1528(0);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Z", line = 546)
    public final boolean method175(int arg0) {
        field355++;
        if (arg0 != 14617) {
            this.field362 = (class219) null;
        }
        return this.method168(true) >= 20;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I", line = 566)
    public static final int method176(int arg0, int arg1) {
        if (arg0 < 90) {
            return -16;
        } else {
            field354++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILph;ILph;Lph;)V", line = 583)
    public static final void method177(int arg0, class229 arg1, int arg2, class229 arg3, class229 arg4) {
        if (arg2 <= -70) {
            class190.method1323(-1, arg1, arg0, 18411, arg3, arg4);
            field353++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BZ)V", line = 602)
    public final void method178(byte arg0, boolean arg1) {
        field359++;
        if (this.field364 == null) {
            return;
        }
        try {
            this.field366.field2670 = 0;
            if (arg0 < 22) {
                this.method166(false, 46, 62, (byte) 2, 69);
            }
            this.field366.method1188(-114, arg1 ? 2 : 3);
            this.field366.method1204((byte) 113, 0);
            this.field364.method527(this.field366.field2668, 20737, 4, 0);
        } catch (IOException var6) {
            try {
                this.field364.method534(-1);
            } catch (Exception var5) {
            }
            this.field369 = -2;
            this.field368++;
            this.field364 = null;
        }
    }
}
