import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class287 extends class513 {

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field3776 = 0;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "D")
    public static double field3780;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "J")
    public long field3778;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "Lww;")
    public class287 field3775;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "Lww;")
    public class287 field3781;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1704(int arg0) {
        field3777++;
        if (arg0 != 1806) {
            method1704(-62);
        }
        class492.field6802.method3210(false);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 23)
    public static final String method1705(String arg0, byte arg1) {
        field3782++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg1 != 48) {
            field3780 = -0.42377983575717904D;
        }
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
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

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V", line = 74)
    public final void method1706(byte arg0) {
        field3779++;
        if (this.field3775 == null) {
            return;
        }
        this.field3775.field3781 = this.field3781;
        this.field3781.field3775 = this.field3775;
        this.field3775 = null;
        this.field3781 = null;
        if (arg0 != 79) {
            field3780 = 0.12662050673835476D;
        }
    }

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)Z", line = 100)
    public final boolean method1707(int arg0) {
        if (arg0 != 0) {
            method1705(null, (byte) 33);
        }
        field3783++;
        return this.field3775 != null;
    }
}
