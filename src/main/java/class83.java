import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class472 {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Z")
    private boolean field1236 = false;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public int field1237 = 0;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
    public boolean field1241 = false;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Ldu;")
    private class479 field1242 = new class479();

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    private int field1246 = 0;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lsm;")
    public class249 field1245 = new class249();

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    private int field1248 = 0;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "Z")
    private boolean field1251 = false;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "Lnd;")
    public class473 field1252 = new class473();

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[Lmh;")
    public class217[] field1240 = new class217[8192];

    @OriginalMember(owner = "client!m", name = "k", descriptor = "J")
    private long field1238;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "J")
    private long field1239;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[Z")
    private static boolean[] field1243 = new boolean[8];

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[Z")
    private static boolean[] field1244 = new boolean[8];

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 5)
    public static void method566() {
        field1243 = null;
        field1244 = null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()Lnd;", line = 9)
    public final class473 method567() {
        return this.field1252;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Lta;Z)V", line = 14)
    private final void method568(class309[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1244[var3] = false;
        }
        label73: for (class306 var4 = (class306) this.field1245.method1544(-85); var4 != null; var4 = (class306) this.field1245.method1546((byte) -42)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4186 || arg0[var7].field4215 == var4.field4186) {
                        field1244[var7] = true;
                        var4.method1854(32480);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1182(28818);
                this.field1248--;
                if (var4.method737((byte) -97)) {
                    var4.method738(-13002);
                    class81.field1220--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1248 != 8; var5++) {
            if (!field1244[var5]) {
                class306 var6 = null;
                if (class347.method2079(arg0[var5].field4221, -1).field1013 == 1 && class81.field1220 < 32) {
                    var6 = new class306(arg0[var5], this);
                    class422.field5809.method2593(var6, (long) arg0[var5].field4221, 123);
                    class81.field1220++;
                }
                if (var6 == null) {
                    var6 = new class306(arg0[var5], this);
                }
                this.field1245.method1553((byte) -124, var6);
                this.field1248++;
                field1244[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "()V", line = 99)
    public final void method569() {
        this.field1241 = true;
        for (class306 var1 = (class306) this.field1245.method1544(-109); var1 != null; var1 = (class306) this.field1245.method1546((byte) -42)) {
            if (var1.field4182.field1013 == 1) {
                var1.method738(-13002);
            }
        }
        this.field1240 = new class217[8192];
        this.field1237 = 0;
        this.field1242 = new class479();
        this.field1246 = 0;
        this.field1245 = new class249();
        this.field1248 = 0;
        this.method2773(26979);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "()V", line = 120)
    public final void method570() {
        this.field1252.field6625.method1429(true);
        for (class294 var1 = (class294) this.field1242.method2823(86); var1 != null; var1 = (class294) this.field1242.method2818(0)) {
            var1.method1819(true, this.field1239);
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "()V", line = 132)
    private final void method571() {
        this.field1236 = false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V", line = 136)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1247 = arg0;
        this.field1254 = arg1;
        this.field1253 = arg2;
        this.field1249 = arg3;
        this.field1250 = arg4;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "()V", line = 151)
    public final void method573() {
        this.field1236 = true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lkm;[Lqm;Z)V", line = 156)
    private final void method574(class487 arg0, class356[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1243[var4] = false;
        }
        label64: for (class294 var5 = (class294) this.field1242.method2823(116); var5 != null; var5 = (class294) this.field1242.method2818(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4055 || arg1[var8].field4967 == var5.field4055) {
                        field1243[var8] = true;
                        var5.method1818(false);
                        var5.field4046 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4033 == 0) {
                    var5.method2773(26979);
                    this.field1246--;
                } else {
                    var5.field4046 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1246 != 8; var6++) {
            if (!field1243[var6]) {
                class294 var7 = new class294(arg0, arg1[var6], this, this.field1238);
                this.field1242.method2817(false, var7);
                this.field1246++;
                field1243[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V", line = 331)
    public class83(int arg0) {
        class70.field1038.method2817(false, this);
        this.field1238 = (long) arg0;
        this.field1239 = (long) arg0;
        this.field1251 = true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lkm;J)Z", line = 235)
    public final boolean method575(class487 arg0, long arg1) {
        if (this.field1239 == this.field1238) {
            this.method571();
        } else {
            this.method573();
        }
        if (arg1 - this.field1238 > 750L) {
            this.method569();
            return false;
        }
        int var4 = (int) (arg1 - this.field1239);
        if (this.field1251) {
            for (class294 var5 = (class294) this.field1242.method2823(82); var5 != null; var5 = (class294) this.field1242.method2818(0)) {
                for (int var6 = 0; var6 < var5.field4063.field2146; var6++) {
                    var5.method1822(arg0, arg1, 20689, !this.field1236, 1);
                }
            }
            this.field1251 = false;
        }
        for (class294 var7 = (class294) this.field1242.method2823(45); var7 != null; var7 = (class294) this.field1242.method2818(0)) {
            var7.method1822(arg0, arg1, 20689, !this.field1236, var4);
        }
        this.field1239 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lkm;J[Lqm;[Lta;Z)V", line = 290)
    public final void method576(class487 arg0, long arg1, class356[] arg2, class309[] arg3, boolean arg4) {
        if (!this.field1241) {
            this.method574(arg0, arg2, arg4);
            this.method568(arg3, arg4);
            this.field1238 = arg1;
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "()V", line = 298)
    public final void method577() {
        this.field1251 = true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(J)V", line = 309)
    public final void method578(long arg0) {
        this.field1238 = arg0;
    }
}
