import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class250 extends class159 {

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public int field3982 = 0;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
    public static int[] field3969 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljo;")
    public static class150 field3988 = new class150();

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field3993 = -1;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3995 = "Connecting to update server";

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "[I")
    public static int[] field3996 = new int[14];

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field3998 = -1;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public int field3989;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Ls;")
    public class126 field3986;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lod;")
    public class233 field3968;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "Lcn;")
    public class237 field3983;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "Lcn;")
    public class237 field3985;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Lkl;")
    public class39 field3984;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Z")
    public boolean field3990;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "[I")
    public int[] field3974;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 11)
    public final void method1776(byte arg0) {
        if (arg0 < 84) {
            return;
        }
        int var2 = this.field3972;
        field3992++;
        if (this.field3986 != null) {
            class126 var5 = this.field3986.method818(-124);
            if (var5 == null) {
                this.field3974 = null;
                this.field3972 = -1;
                this.field3997 = 0;
                this.field3973 = 0;
                this.field3981 = 0;
                this.field3980 = 0;
            } else {
                this.field3981 = var5.field1921;
                this.field3973 = var5.field1945;
                this.field3980 = var5.field1910 * 128;
                this.field3997 = var5.field1907;
                this.field3974 = var5.field1946;
                this.field3972 = var5.field1928;
            }
        } else if (this.field3968 != null) {
            int var3 = class142.method1004(this.field3968, 20438);
            if (var2 != var3) {
                this.field3972 = var3;
                class139 var4 = this.field3968.field3702;
                if (var4.field2229 != null) {
                    var4 = var4.method987(-1);
                }
                if (var4 == null) {
                    this.field3973 = this.field3980 = 0;
                } else {
                    this.field3980 = var4.field2191 * 128;
                    this.field3973 = var4.field2195;
                }
            }
        } else if (this.field3984 != null) {
            this.field3972 = class68.method477((byte) -119, this.field3984);
            this.field3973 = this.field3984.field587;
            this.field3980 = this.field3984.field579 * 128;
        }
        if (this.field3972 != var2 && this.field3983 != null) {
            class28.field434.method1412(this.field3983);
            this.field3983 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 101)
    public static final void method1777(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class217.field3346[var1] = false;
        }
        class39.field602 = arg0;
        class270.field4456 = -1;
        class206.field3132 = 0;
        field3979++;
        class269.field4427 = 5;
        field3998 = -1;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V", line = 128)
    public static void method1778(int arg0) {
        field3995 = null;
        if (arg0 != 0) {
            field3988 = (class150) null;
        }
        field3988 = null;
        field3969 = null;
        field3996 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 145)
    public static final void method1779(boolean arg0) {
        class202.field3101.method644((byte) -103);
        field3976++;
        if (arg0) {
            field3994 = 22;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)Z", line = 157)
    public static final boolean method1780(char arg0, int arg1) {
        field3991++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != 0) {
                field3969 = (int[]) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I", line = 197)
    public static final int method1781(int arg0, int arg1) {
        field3975++;
        return arg1 < 110 ? 75 : arg0 & 0xFF;
    }
}
