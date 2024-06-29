import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class97 extends class120 {

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field1239 = 0;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Z")
    public boolean field1244 = false;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lbc;")
    private class225 field1236 = new class225();

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    private int field1245 = 0;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lkr;")
    public class486 field1246 = new class486();

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    private int field1247 = 0;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "Z")
    private boolean field1249 = false;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "Lcs;")
    public class207 field1252 = new class207();

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[Lrl;")
    public class468[] field1243 = new class468[8192];

    @OriginalMember(owner = "client!g", name = "o", descriptor = "J")
    private long field1240;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "J")
    private long field1237;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[Z")
    private static boolean[] field1238 = new boolean[8];

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[Z")
    private static boolean[] field1241 = new boolean[8];

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
    public final void method548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1253 = arg0;
        this.field1254 = arg1;
        this.field1251 = arg2;
        this.field1248 = arg3;
        this.field1250 = arg4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnp;J)Z")
    public final boolean method549(class313 arg0, long arg1) {
        if (this.field1240 == this.field1237) {
            this.method553();
        } else {
            this.method554();
        }
        if (arg1 - this.field1240 > 750L) {
            this.method557();
            return false;
        }
        int var4 = (int) (arg1 - this.field1237);
        if (this.field1249) {
            for (class424 var5 = (class424) this.field1236.method1449(110); var5 != null; var5 = (class424) this.field1236.method1450(0)) {
                for (int var6 = 0; var6 < var5.field5942.field2641; var6++) {
                    var5.method2493(1, !this.field1242, arg1, arg0, 112);
                }
            }
            this.field1249 = false;
        }
        for (class424 var7 = (class424) this.field1236.method1449(112); var7 != null; var7 = (class424) this.field1236.method1450(0)) {
            var7.method2493(var4, !this.field1242, arg1, arg0, 121);
        }
        this.field1237 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
    public static void method550() {
        field1238 = null;
        field1241 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([Lmm;Z)V")
    private final void method551(class168[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1241[var3] = false;
        }
        label73: for (class131 var4 = (class131) this.field1246.method2843(1123227612); var4 != null; var4 = (class131) this.field1246.method2842(1673506446)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1712 || arg0[var7].field2450 == var4.field1712) {
                        field1241[var7] = true;
                        var4.method822(21403);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1510((byte) -13);
                this.field1247--;
                if (var4.method1672(127)) {
                    var4.method1673((byte) 27);
                    class418.field5828--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1247 != 8; var5++) {
            if (!field1241[var5]) {
                class131 var6 = null;
                if (class452.method2641(arg0[var5].field2456, 2).field3766 == 1 && class418.field5828 < 32) {
                    var6 = new class131(arg0[var5], this);
                    class404.field5695.method241((long) arg0[var5].field2456, var6, true);
                    class418.field5828++;
                }
                if (var6 == null) {
                    var6 = new class131(arg0[var5], this);
                }
                this.field1246.method2845(var6, (byte) 37);
                this.field1247++;
                field1241[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()Lcs;")
    public final class207 method552() {
        return this.field1252;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()V")
    private final void method553() {
        this.field1242 = false;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "()V")
    public final void method554() {
        this.field1242 = true;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "()V")
    public final void method555() {
        this.field1252.field3161.method1516((byte) 119);
        for (class424 var1 = (class424) this.field1236.method1449(112); var1 != null; var1 = (class424) this.field1236.method1450(0)) {
            var1.method2487((byte) -85, this.field1237);
        }
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "()V")
    public final void method556() {
        this.field1249 = true;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "()V")
    public final void method557() {
        this.field1244 = true;
        for (class131 var1 = (class131) this.field1246.method2843(1123227612); var1 != null; var1 = (class131) this.field1246.method2842(1673506446)) {
            if (var1.field1711.field3766 == 1) {
                var1.method1673((byte) 27);
            }
        }
        this.field1243 = new class468[8192];
        this.field1239 = 0;
        this.field1236 = new class225();
        this.field1245 = 0;
        this.field1246 = new class486();
        this.field1247 = 0;
        this.method738((byte) -2);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnp;J[Lvq;[Lmm;Z)V")
    public final void method558(class313 arg0, long arg1, class295[] arg2, class168[] arg3, boolean arg4) {
        if (!this.field1244) {
            this.method559(arg0, arg2, arg4);
            this.method551(arg3, arg4);
            this.field1240 = arg1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnp;[Lvq;Z)V")
    private final void method559(class313 arg0, class295[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1238[var4] = false;
        }
        label64: for (class424 var5 = (class424) this.field1236.method1449(127); var5 != null; var5 = (class424) this.field1236.method1450(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5951 || arg1[var8].field4266 == var5.field5951) {
                        field1238[var8] = true;
                        var5.method2488(0);
                        var5.field5923 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5926 == 0) {
                    var5.method738((byte) -2);
                    this.field1245--;
                } else {
                    var5.field5923 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1245 != 8; var6++) {
            if (!field1238[var6]) {
                class424 var7 = new class424(arg0, arg1[var6], this, this.field1240);
                this.field1236.method1444(var7, (byte) 124);
                this.field1245++;
                field1238[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(J)V")
    public final void method560(long arg0) {
        this.field1240 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
    public class97(int arg0) {
        class460.field6451.method1444(this, (byte) 112);
        this.field1240 = (long) arg0;
        this.field1237 = (long) arg0;
        this.field1249 = true;
    }
}
