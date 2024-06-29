import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class138 extends class264 {

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public int field1891 = 0;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Leb;")
    public static class395 field1885 = new class395();

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Lgn;")
    public class178 field1890;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lhh;")
    public class190 field1886;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Lhh;")
    public class190 field1898;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lwe;")
    public class26 field1881;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lwc;")
    public class380 field1902;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Z")
    public boolean field1889;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "[I")
    public int[] field1896;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public static void method916(int arg0) {
        field1885 = null;
        if (arg0 != -1) {
            method918(-21L, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public final void method917(int arg0) {
        field1903++;
        int var2 = this.field1901;
        if (this.field1890 != null) {
            class178 var5 = this.field1890.method1240((byte) -116);
            if (var5 == null) {
                this.field1882 = 0;
                this.field1893 = 0;
                this.field1884 = 0;
                this.field1883 = 0;
                this.field1901 = -1;
                this.field1896 = null;
            } else {
                this.field1901 = var5.field2513;
                this.field1893 = var5.field2500;
                this.field1896 = var5.field2493;
                this.field1882 = var5.field2515 * 128;
                this.field1883 = var5.field2504;
                this.field1884 = var5.field2470;
            }
        } else if (this.field1881 != null) {
            int var3 = class171.method1110(this.field1881, true);
            if (var2 != var3) {
                this.field1901 = var3;
                class327 var4 = this.field1881.field369;
                if (var4.field4871 != null) {
                    var4 = var4.method2139(true);
                }
                if (var4 == null) {
                    this.field1884 = this.field1882 = 0;
                } else {
                    this.field1884 = var4.field4840;
                    this.field1882 = var4.field4842 * 128;
                }
            }
        } else if (this.field1902 != null) {
            this.field1901 = class278.method1889(this.field1902, (byte) 44);
            this.field1882 = this.field1902.field5560 * 128;
            this.field1884 = this.field1902.field5567;
        }
        if (this.field1901 != var2 && this.field1898 != null) {
            class452.field6671.method278(this.field1898);
            this.field1898 = null;
        }
        if (arg0 != 0) {
            this.field1884 = -117;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method918(long arg0, byte arg1) {
        field1899++;
        class137.field1878.setTime(new Date(arg0));
        int var3 = class137.field1878.get(7);
        int var4 = class137.field1878.get(5);
        int var5 = class137.field1878.get(2);
        int var6 = class137.field1878.get(1);
        int var7 = 127 / ((arg1 + 35) / 63);
        int var8 = class137.field1878.get(11);
        int var9 = class137.field1878.get(12);
        int var10 = class137.field1878.get(13);
        return class166.field2195[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class403.field5833[var5] + "-" + var6 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    static {
        new class409("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
