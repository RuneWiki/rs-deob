import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class96 extends class121 {

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "Z")
    public boolean field1183 = false;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "Z")
    private boolean field1186 = false;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field1185 = 0;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "Lgu;")
    private class126 field1187 = new class126();

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    private int field1192 = 0;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "Lrk;")
    public class419 field1191 = new class419();

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "Z")
    private boolean field1196 = false;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    private int field1194 = 0;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "Loaa;")
    public class510 field1199 = new class510();

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "[Lsv;")
    public class389[] field1182 = new class389[8192];

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "[Z")
    private static boolean[] field1184 = new boolean[8];

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "[Z")
    private static boolean[] field1189 = new boolean[8];

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "J")
    private long field1188;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "J")
    private long field1190;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqa;)V")
    public final void method543(class167 arg0) {
        this.field1199.field7577.method3014((byte) 75);
        for (class215 var2 = (class215) this.field1187.method772(0); var2 != null; var2 = (class215) this.field1187.method775(2)) {
            var2.method1390(arg0, this.field1188, -32767);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method544(class167 arg0, long arg1) {
        if (this.field1190 == this.field1188) {
            this.method548();
        } else {
            this.method556();
        }
        if (arg1 - this.field1190 > 750L) {
            this.method555();
            return false;
        }
        int var4 = (int) (arg1 - this.field1188);
        if (this.field1196) {
            for (class215 var5 = (class215) this.field1187.method772(0); var5 != null; var5 = (class215) this.field1187.method775(2)) {
                for (int var6 = 0; var6 < var5.field3150.field6508; var6++) {
                    var5.method1387((byte) -51, 1, arg1, arg0, !this.field1186);
                }
            }
            this.field1196 = false;
        }
        for (class215 var7 = (class215) this.field1187.method772(0); var7 != null; var7 = (class215) this.field1187.method775(2)) {
            var7.method1387((byte) -51, var4, arg1, arg0, !this.field1186);
        }
        this.field1188 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
    private final void method545(int arg0) {
        class585.field8699.method770(-65537, this);
        this.field1190 = arg0;
        this.field1188 = arg0;
        this.field1196 = true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "()V")
    public final void method546() {
        this.field1196 = true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqa;J[Lmm;[Lkv;Z)V")
    public final void method547(class167 arg0, long arg1, class26[] arg2, class200[] arg3, boolean arg4) {
        if (!this.field1183) {
            this.method554(arg0, arg2, arg4);
            this.method549(arg3, arg4);
            this.field1190 = arg1;
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "()V")
    private final void method548() {
        this.field1186 = false;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([Lkv;Z)V")
    private final void method549(class200[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1189[var3] = false;
        }
        label73: for (class257 var4 = (class257) this.field1191.method2496((byte) 7); var4 != null; var4 = (class257) this.field1191.method2494(106)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3753 || arg0[var7].field2999 == var4.field3753) {
                        field1189[var7] = true;
                        var4.method1624(-18733);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2997(1);
                this.field1194--;
                if (var4.method3224(-11301)) {
                    var4.method3225(-51);
                    class269.field3989--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1194 != 8; var5++) {
            if (!field1189[var5]) {
                class257 var6 = null;
                if (arg0[var5].method1295(17).field3202 == 1 && class269.field3989 < 32) {
                    var6 = new class257(arg0[var5], this);
                    class157.field2004.method3623(var6, (long) arg0[var5].field3005, 116);
                    class269.field3989++;
                }
                if (var6 == null) {
                    var6 = new class257(arg0[var5], this);
                }
                this.field1191.method2492(var6, (byte) 98);
                this.field1194++;
                field1189[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "()Loaa;")
    public final class510 method550() {
        return this.field1199;
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "()V")
    public static void method551() {
        field1184 = null;
        field1189 = null;
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Lqv;")
    public static final class96 method552(int arg0) {
        if (class626.field9182 == class295.field4327) {
            return new class96(arg0);
        } else {
            class96 var1 = class264.field3912[class626.field9182];
            class626.field9182 = class626.field9182 + 1 & class622.field9112[class588.field8730];
            var1.method545(arg0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(J)V")
    public final void method553(long arg0) {
        this.field1190 = arg0;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqa;[Lmm;Z)V")
    private final void method554(class167 arg0, class26[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1184[var4] = false;
        }
        label64: for (class215 var5 = (class215) this.field1187.method772(0); var5 != null; var5 = (class215) this.field1187.method775(2)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3167 || arg1[var8].field234 == var5.field3167) {
                        field1184[var8] = true;
                        var5.method1388((byte) -96);
                        var5.field3178 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3176 == 0) {
                    var5.method736((byte) -127);
                    this.field1192--;
                } else {
                    var5.field3178 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1192 != 8; var6++) {
            if (!field1184[var6]) {
                class215 var7 = new class215(arg0, arg1[var6], this, this.field1190);
                this.field1187.method770(-65537, var7);
                this.field1192++;
                field1184[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "()V")
    public final void method555() {
        this.field1183 = true;
        for (class257 var1 = (class257) this.field1191.method2496((byte) 72); var1 != null; var1 = (class257) this.field1191.method2494(37)) {
            if (var1.field3755.field3202 == 1) {
                var1.method3225(-60);
            }
        }
        for (int var2 = 0; var2 < this.field1182.length; var2++) {
            if (this.field1182[var2] != null) {
                this.field1182[var2].method2350();
                this.field1182[var2] = null;
            }
        }
        this.field1185 = 0;
        this.field1187 = new class126();
        this.field1192 = 0;
        this.field1191 = new class419();
        this.field1194 = 0;
        this.method736((byte) -128);
        class264.field3912[class295.field4327] = this;
        class295.field4327 = class295.field4327 + 1 & class622.field9112[class588.field8730];
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "()V")
    public final void method556() {
        this.field1186 = true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIII)V")
    public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1200 = arg0;
        this.field1195 = arg1;
        this.field1198 = arg2;
        this.field1193 = arg3;
        this.field1197 = arg4;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(I)V")
    private class96(int arg0) {
        this.method545(arg0);
    }
}
