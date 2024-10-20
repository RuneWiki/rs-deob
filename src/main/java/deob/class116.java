package deob;

@ObfuscatedName("dx")
public final class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Z")
    public static final boolean method515(String arg0, String arg1, String arg2, String arg3) {
        if (arg0 == null || arg2 == null) {
            return false;
        } else if (arg0.startsWith("#") || arg2.startsWith("#")) {
            return arg0.equals(arg2);
        } else {
            return arg1.equals(arg3);
        }
    }
}
