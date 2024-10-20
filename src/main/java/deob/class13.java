package deob;

@ObfuscatedName("fi")
public class class13 {

    @ObfuscatedName("fi.dw")
    public long field76;

    @ObfuscatedName("fi.dl")
    public class13 field77;

    @ObfuscatedName("fi.ei")
    public class13 field78;

    @ObfuscatedName("fi.ii()V")
    public void method76() {
        if (this.field78 != null) {
            this.field78.field77 = this.field77;
            this.field77.field78 = this.field78;
            this.field77 = null;
            this.field78 = null;
        }
    }

    @ObfuscatedName("fi.ib()Z")
    public boolean method78() {
        return this.field78 != null;
    }
}
