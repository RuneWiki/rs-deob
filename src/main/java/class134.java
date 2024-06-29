import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class134 extends class76 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[Ld;")
    public static class102[] field1941 = new class102[14];

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field1943 = 0;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Ljm;")
    public static class485 field1938 = new class485(32, 3);

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)V", line = 7)
    public static void method881(byte arg0) {
        field1938 = null;
        if (arg0 != 104) {
            method881((byte) -109);
        }
        field1941 = null;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIII)V", line = 24)
    public class134(int arg0, int arg1, int arg2, int arg3) {
        this.field1936 = arg2;
        this.field1939 = arg1;
        this.field1937 = arg0;
        this.field1942 = arg3;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 37)
    public static final String method882(boolean arg0, String arg1) {
        field1940++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Z)V", line = 86)
    public static final void method883(boolean arg0) {
        if (!arg0) {
            field1943 = 93;
        }
        field1935++;
        if (class418.field6109 == null) {
            return;
        }
        class521.field7677.method2301(!arg0);
        class166.method1029();
        class499.method2942(-1);
        class386.method2222(!arg0);
        class274.method1554(true);
        class23.method177(false);
        if (class325.field4462 != null) {
            class325.field4462.method2188((byte) 50);
        }
        class368.method2134((byte) -78);
        class193.method1169(-11544);
        class43.method277(104);
        class101.method671(false, 64);
        class223.method1316(63);
        for (int var1 = 0; var1 < 2048; var1++) {
            class192 var5 = class309.field4234[var1];
            if (var5 != null) {
                var5.field366 = null;
                for (int var6 = 0; var6 < var5.field369.length; var6++) {
                    var5.field369[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class179.field2534.length; var2++) {
            class405 var3 = class179.field2534[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field369.length; var4++) {
                    var3.field369[var4] = null;
                }
            }
        }
        class418.field6109.method1001((byte) -126);
        class418.field6109 = null;
    }
}
