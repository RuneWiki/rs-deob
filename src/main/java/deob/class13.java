package deob;

@ObfuscatedName("fi")
public class class13 {

    @ObfuscatedName("fi.j")
    public class4 field63 = new class4();

    @ObfuscatedName("fi.p")
    public class4 field64;

    @ObfuscatedName("fi.j()V")
    public void method247() {
        while (true) {
            class4 var1 = this.field63.field9;
            if (this.field63 == var1) {
                this.field64 = null;
                return;
            }
            var1.method44();
        }
    }

    @ObfuscatedName("fi.p(Lfx;)V")
    public void method248(class4 arg0) {
        if (arg0.field10 != null) {
            arg0.method44();
        }
        arg0.field10 = this.field63.field10;
        arg0.field9 = this.field63;
        arg0.field10.field9 = arg0;
        arg0.field9.field10 = arg0;
    }

    @ObfuscatedName("fi.o(Lfx;)V")
    public void method249(class4 arg0) {
        if (arg0.field10 != null) {
            arg0.method44();
        }
        arg0.field10 = this.field63;
        arg0.field9 = this.field63.field9;
        arg0.field10.field9 = arg0;
        arg0.field9.field10 = arg0;
    }

    @ObfuscatedName("fi.r()Lfx;")
    public class4 method252() {
        class4 var1 = this.field63.field10;
        if (this.field63 == var1) {
            return null;
        } else {
            var1.method44();
            return var1;
        }
    }

    @ObfuscatedName("fi.n()Lfx;")
    public class4 method253() {
        class4 var1 = this.field63.field9;
        if (this.field63 == var1) {
            this.field64 = null;
            return null;
        } else {
            this.field64 = var1.field9;
            return var1;
        }
    }

    @ObfuscatedName("fi.g()Lfx;")
    public class4 method254() {
        class4 var1 = this.field63.field10;
        if (this.field63 == var1) {
            this.field64 = null;
            return null;
        } else {
            this.field64 = var1.field10;
            return var1;
        }
    }

    @ObfuscatedName("fi.e()Lfx;")
    public class4 method255() {
        class4 var1 = this.field64;
        if (this.field63 == var1) {
            this.field64 = null;
            return null;
        } else {
            this.field64 = var1.field9;
            return var1;
        }
    }

    @ObfuscatedName("fi.f()Lfx;")
    public class4 method256() {
        class4 var1 = this.field64;
        if (this.field63 == var1) {
            this.field64 = null;
            return null;
        } else {
            this.field64 = var1.field10;
            return var1;
        }
    }

    public class13() {
        this.field63.field9 = this.field63;
        this.field63.field10 = this.field63;
    }

    @ObfuscatedName("fi.t(Lfx;Lfx;)V")
    public static void method270(class4 arg0, class4 arg1) {
        if (arg0.field10 != null) {
            arg0.method44();
        }
        arg0.field10 = arg1.field10;
        arg0.field9 = arg1;
        arg0.field10.field9 = arg0;
        arg0.field9.field10 = arg0;
    }

    @ObfuscatedName("fi.h()Lfx;")
    public class4 method272() {
        class4 var1 = this.field63.field9;
        if (this.field63 == var1) {
            return null;
        } else {
            var1.method44();
            return var1;
        }
    }
}
