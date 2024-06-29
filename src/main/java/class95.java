import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class95 extends class92 {

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    private int field2051 = 16;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[Lod;")
    private class88[] field2050 = new class88[8];

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lod;")
    private class88 field2052 = new class88();

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    private int field2054 = -1;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    private int field2053 = 0;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    private int field2055 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpc;)V", line = 13)
    public final synchronized void method723(class92 arg0) {
        class88 var2 = this.field2050[method727(arg0)];
        var2.method700((byte) -117, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "([III)I", line = 17)
    private final int method724(int[] arg0, int arg1, int arg2) {
        this.field2053 -= arg2;
        if (this.field2053 <= 0) {
            this.field2053 += class14.field251 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class88 var5 = this.field2050[var4];
                for (class92 var6 = (class92) var5.method695((byte) -122); var6 != null; var6 = (class92) var5.method702(0)) {
                    int var7 = method727(var6);
                    if (var4 != var7) {
                        this.field2050[var7].method700((byte) -104, var6);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class88 var19 = this.field2050[var8];
            for (class92 var20 = (class92) var19.method695((byte) -115); var20 != null; var20 = (class92) var19.method702(0)) {
                var20.field2029 = false;
                if (var20.field2028 != null) {
                    var20.field2028.field2164 = 0;
                }
            }
        }
        int var9 = 0;
        int var10 = 255;
        int var11 = 7;
        while (var10 != 0) {
            int var12;
            int var13;
            if (var11 < 0) {
                var12 = var11 & 0x3;
                var13 = -(var11 >> 2);
            } else {
                var12 = var11;
                var13 = 0;
            }
            for (int var14 = var10 >>> var12 & 0x11111111; var14 != 0; var14 >>>= 0x4) {
                if ((var14 & 0x1) != 0) {
                    var10 &= ~(0x1 << var12);
                    class88 var15 = this.field2050[var12];
                    for (class92 var16 = (class92) var15.method695((byte) -112); var16 != null; var16 = (class92) var15.method702(0)) {
                        if (!var16.field2029) {
                            class102 var17 = var16.field2028;
                            if (var17 == null || var17.field2164 <= var13) {
                                if (var9 < this.field2051) {
                                    int var18 = var16.method545(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field2164 += var18;
                                    }
                                } else {
                                    var16.method544(arg2);
                                }
                                var16.field2029 = true;
                            } else {
                                var10 |= 0x1 << var12;
                            }
                        }
                    }
                }
                var12 += 4;
                var13++;
            }
            var11--;
        }
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 151)
    private final void method725() {
        if (this.field2055 <= 0) {
            return;
        }
        for (class2 var1 = (class2) this.field2052.method695((byte) -120); var1 != null; var1 = (class2) this.field2052.method702(0)) {
            var1.field28 -= this.field2055;
        }
        this.field2054 -= this.field2055;
        this.field2055 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 171)
    public final synchronized void method544(int arg0) {
        do {
            if (this.field2054 < 0) {
                this.method728(arg0);
                return;
            }
            if (this.field2055 + arg0 < this.field2054) {
                this.field2055 += arg0;
                this.method728(arg0);
                return;
            }
            int var2 = this.field2054 - this.field2055;
            this.method728(var2);
            arg0 -= var2;
            this.field2055 += var2;
            this.method725();
            class2 var3 = (class2) this.field2052.method695((byte) -117);
            synchronized (var3) {
                int var5 = var3.method7(this);
                if (var5 < 0) {
                    var3.field28 = 0;
                    this.method729(var3);
                } else {
                    var3.field28 = var5;
                    this.method726(var3.field733, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lg;Laa;)V", line = 215)
    private final void method726(class37 arg0, class2 arg1) {
        while (this.field2052.field1984 != arg0 && ((class2) arg0).field28 <= arg1.field28) {
            arg0 = arg0.field733;
        }
        this.field2052.method694(-36, arg0, arg1);
        this.field2054 = ((class2) this.field2052.field1984.field733).field28;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lpc;)I", line = 222)
    private static final int method727(class92 arg0) {
        return arg0.method549() >> 5;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 225)
    private final void method728(int arg0) {
        this.field2053 -= arg0;
        if (this.field2053 < 0) {
            this.field2053 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class88 var3 = this.field2050[var2];
            for (class92 var4 = (class92) var3.method695((byte) -121); var4 != null; var4 = (class92) var3.method702(0)) {
                var4.method544(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 329)
    public class95() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field2050[var1] = new class88();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([III)I", line = 256)
    public final synchronized int method545(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field2054 < 0) {
                return this.method724(arg0, arg1, arg2);
            }
            if (this.field2055 + arg2 < this.field2054) {
                this.field2055 += arg2;
                return this.method724(arg0, arg1, arg2);
            }
            int var4 = this.field2054 - this.field2055;
            var5 = this.method724(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2055 += var4;
            this.method725();
            class2 var6 = (class2) this.field2052.method695((byte) -114);
            synchronized (var6) {
                int var8 = var6.method7(this);
                if (var8 < 0) {
                    var6.field28 = 0;
                    this.method729(var6);
                } else {
                    var6.field28 = var8;
                    this.method726(var6.field733, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Laa;)V", line = 298)
    private final void method729(class2 arg0) {
        arg0.method333(0);
        arg0.method6();
        class37 var2 = this.field2052.field1984.field733;
        if (this.field2052.field1984 == var2) {
            this.field2054 = -1;
        } else {
            this.field2054 = ((class2) var2).field28;
        }
    }
}
