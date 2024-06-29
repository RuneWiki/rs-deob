import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class354 extends class59 {

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public int field5245 = 0;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Z")
    public boolean field5241 = false;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "Z")
    private boolean field5244 = false;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "Lks;")
    private class305 field5238 = new class305();

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    private int field5247 = 0;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "Loe;")
    public class137 field5248 = new class137();

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "Z")
    private boolean field5251 = false;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    private int field5256 = 0;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Lkp;")
    public class341 field5252 = new class341();

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "[Lvl;")
    public class11[] field5246 = new class11[8192];

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "J")
    private long field5242;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "J")
    private long field5243;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "[Z")
    private static boolean[] field5240 = new boolean[8];

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "[Z")
    private static boolean[] field5239 = new boolean[8];

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public int field5253;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()V", line = 3)
    public final void method2217() {
        this.field5251 = true;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lya;[Luj;Z)V", line = 9)
    private final void method2218(class38 arg0, class262[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5240[var4] = false;
        }
        label64: for (class32 var5 = (class32) this.field5238.method1958(68); var5 != null; var5 = (class32) this.field5238.method1961(112)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field350 || arg1[var8].field4029 == var5.field350) {
                        field5240[var8] = true;
                        var5.method221((byte) 114);
                        var5.field355 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field342 == 0) {
                    var5.method526((byte) 100);
                    this.field5247--;
                } else {
                    var5.field355 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5247 != 8; var6++) {
            if (!field5240[var6]) {
                class32 var7 = new class32(arg0, arg1[var6], this, this.field5242);
                this.field5238.method1957(126, var7);
                this.field5247++;
                field5240[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "()V", line = 81)
    private final void method2219() {
        this.field5244 = false;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "()V", line = 88)
    public final void method2220() {
        this.field5244 = true;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "()Lkp;", line = 94)
    public final class341 method2221() {
        return this.field5252;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lya;J)Z", line = 97)
    public final boolean method2222(class38 arg0, long arg1) {
        if (this.field5243 == this.field5242) {
            this.method2219();
        } else {
            this.method2220();
        }
        if (arg1 - this.field5242 > 750L) {
            this.method2229();
            return false;
        }
        int var4 = (int) (arg1 - this.field5243);
        if (this.field5251) {
            for (class32 var5 = (class32) this.field5238.method1958(10); var5 != null; var5 = (class32) this.field5238.method1961(-116)) {
                for (int var6 = 0; var6 < var5.field346.field2773; var6++) {
                    var5.method228(arg1, 1, !this.field5244, arg0, -1);
                }
            }
            this.field5251 = false;
        }
        for (class32 var7 = (class32) this.field5238.method1958(12); var7 != null; var7 = (class32) this.field5238.method1961(117)) {
            var7.method228(arg1, var4, !this.field5244, arg0, -1);
        }
        this.field5243 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lya;J[Luj;[Ldv;Z)V", line = 146)
    public final void method2223(class38 arg0, long arg1, class262[] arg2, class471[] arg3, boolean arg4) {
        if (!this.field5241) {
            this.method2218(arg0, arg2, arg4);
            this.method2224(arg3, arg4);
            this.field5242 = arg1;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([Ldv;Z)V", line = 157)
    private final void method2224(class471[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5239[var3] = false;
        }
        label73: for (class73 var4 = (class73) this.field5248.method1004((byte) -68); var4 != null; var4 = (class73) this.field5248.method996(1)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1031 || arg0[var7].field6802 == var4.field1031) {
                        field5239[var7] = true;
                        var4.method639(79);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2677(-22491);
                this.field5256--;
                if (var4.method2751(-100)) {
                    var4.method2754(-152804768);
                    class324.field4847--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5256 != 8; var5++) {
            if (!field5239[var5]) {
                class73 var6 = null;
                if (arg0[var5].method2839(124).field4178 == 1 && class324.field4847 < 32) {
                    var6 = new class73(arg0[var5], this);
                    class132.field2021.method825(var6, (long) arg0[var5].field6804, 0);
                    class324.field4847++;
                }
                if (var6 == null) {
                    var6 = new class73(arg0[var5], this);
                }
                this.field5248.method994(var6, -3610);
                this.field5256++;
                field5239[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "()V", line = 247)
    public final void method2225() {
        this.field5252.field5066.method2708(0);
        for (class32 var1 = (class32) this.field5238.method1958(99); var1 != null; var1 = (class32) this.field5238.method1961(-25)) {
            var1.method226(this.field5243, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "()V", line = 259)
    public static void method2226() {
        field5240 = null;
        field5239 = null;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V", line = 331)
    public class354(int arg0) {
        class465.field6733.method1957(127, this);
        this.field5242 = arg0;
        this.field5243 = arg0;
        this.field5251 = true;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(J)V", line = 270)
    public final void method2227(long arg0) {
        this.field5242 = arg0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V", line = 273)
    public final void method2228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5254 = arg0;
        this.field5249 = arg1;
        this.field5250 = arg2;
        this.field5255 = arg3;
        this.field5253 = arg4;
    }

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "()V", line = 286)
    public final void method2229() {
        this.field5241 = true;
        for (class73 var1 = (class73) this.field5248.method1004((byte) -128); var1 != null; var1 = (class73) this.field5248.method996(1)) {
            if (var1.field1042.field4178 == 1) {
                var1.method2754(-152804768);
            }
        }
        this.field5246 = new class11[8192];
        this.field5245 = 0;
        this.field5238 = new class305();
        this.field5247 = 0;
        this.field5248 = new class137();
        this.field5256 = 0;
        this.method526((byte) 121);
    }
}
