import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class169 {

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Lpm;")
    public static class349 field2394 = new class349("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "[Lb;")
    public static class183[] field2396 = new class183[14];

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "[I")
    public static int[] field2397 = new int[2500];

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Z")
    public final boolean method1206(int arg0) {
        field2391++;
        if (arg0 != 8) {
            method1210(98);
        }
        return (this.field2386 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Z")
    public final boolean method1207(boolean arg0) {
        if (arg0) {
            field2390++;
            return (this.field2386 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field2394 = null;
        field2396 = null;
        field2397 = null;
        int var1 = 62 % ((arg0 + 43) / 48);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1209(String arg0, int arg1) {
        field2387++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = -15 % ((9 - arg1) / 44);
        for (int var5 = 0; var5 < var2; var5++) {
            char var9 = arg0.charAt(var5);
            if (var9 == '<' || var9 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var6 = new StringBuffer(var2 + var3);
        for (int var7 = 0; var7 < var2; var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 == '<') {
                var6.append("<lt>");
            } else if (var8 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var8);
            }
        }
        return var6.toString();
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
    public static final void method1210(int arg0) {
        if (arg0 != -11373) {
            field2395 = -5;
        }
        field2389++;
        class390.field5490.method965(class167.field2379, class19.field257, class380.field5401);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
    public final boolean method1211(int arg0) {
        if (arg0 == -17853) {
            field2385++;
            return (this.field2386 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z")
    public final boolean method1212(byte arg0) {
        int var2 = -114 % ((arg0 + 40) / 47);
        field2388++;
        return (this.field2386 & 0x1) != 0;
    }
}
