import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class13 {

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private int field282 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    private int field267 = -1;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lbb;")
    private class49 field279 = new class49();

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Z")
    public boolean field287 = false;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[Lk;")
    private class244[] field277;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[[I")
    private int[][] field276;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
    public static short[] field274 = new short[] { 49, 29, 17, 4, 5, 23, 33, 26 };

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field273 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[Z")
    public static boolean[] field283 = new boolean[100];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Laj;")
    public static class151 field285;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Laj;")
    public static class151 field286;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Ljava/lang/String;")
    public static String field271;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(CI)C")
    public static final char method71(char arg0, int arg1) {
        if (arg1 != 11117) {
            field273 = null;
        }
        field272++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method72(int arg0) {
        if (arg0 < 53) {
            method71((char) 65408, -69);
        }
        field271 = null;
        field283 = null;
        field286 = null;
        field285 = null;
        field273 = null;
        field274 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)[[I")
    public final int[][] method73(int arg0) {
        field280++;
        if (this.field281 != this.field275) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field275; var2++) {
            this.field277[var2] = class122.field2041;
        }
        return this.field276;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public final void method74(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            this.field267 = 47;
        }
        while (this.field275 > var2) {
            this.field276[var2] = null;
            var2++;
        }
        this.field277 = null;
        this.field276 = null;
        this.field279.method317(76);
        field269++;
        this.field279 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)Lmb;")
    public static final class71 method75(boolean arg0, int arg1) {
        field268++;
        class71 var2 = (class71) class110.field1823.method99((long) arg1, true);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return null;
        } else {
            byte[] var3 = class20.field361.method1149(class12.method67((byte) 6, arg1), (byte) 75, class154.method1171(0, arg1));
            class71 var4 = new class71();
            var4.field1237 = arg1;
            if (var3 != null) {
                var4.method505(new class249(var3), 0);
            }
            var4.method493(113);
            if (var4.field1195 != -1) {
                var4.method499(method75(false, var4.field1198), method75(false, var4.field1195), true);
            }
            if (var4.field1214 != -1) {
                var4.method487(method75(false, var4.field1214), method75(false, var4.field1250), 12568);
            }
            if (!class81.field1351 && var4.field1224) {
                var4.field1189 = false;
                var4.field1240 = class271.field4514;
                var4.field1230 = 0;
                var4.field1200 = class217.field3661;
                var4.field1209 = class162.field2628;
            }
            class110.field1823.method100((long) arg1, var4, 61);
            return var4;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    public static final int method76(int arg0, int arg1) {
        if (arg1 == 255) {
            field270++;
            return arg0 & 0xFF;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        if (arg1 > -25) {
            this.method74(true);
        }
        field278++;
        if (this.field281 == this.field275) {
            this.field287 = this.field277[arg0] == null;
            this.field277[arg0] = class122.field2041;
            return this.field276[arg0];
        } else if (this.field275 == 1) {
            this.field287 = this.field267 != arg0;
            this.field267 = arg0;
            return this.field276[0];
        } else {
            class244 var3 = this.field277[arg0];
            if (var3 == null) {
                this.field287 = true;
                if (this.field282 >= this.field275) {
                    class244 var4 = (class244) this.field279.method319(111);
                    var3 = new class244(arg0, var4.field4092);
                    this.field277[var4.field4084] = null;
                    var4.method993(32);
                } else {
                    var3 = new class244(arg0, this.field282);
                    this.field282++;
                }
                this.field277[arg0] = var3;
            } else {
                this.field287 = false;
            }
            this.field279.method313(1, var3);
            return this.field276[var3.field4092];
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(III)V")
    public class13(int arg0, int arg1, int arg2) {
        this.field281 = arg1;
        this.field275 = arg0;
        this.field277 = new class244[this.field281];
        this.field276 = new int[this.field275][arg2];
    }
}
