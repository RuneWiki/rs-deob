import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class43 extends class130 {

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lsd;")
    public static class166 field759 = null;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lsd;")
    public static class166 field782 = class135.method935("null", 0);

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Lbb;")
    public class13 field769;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Lre;")
    public static class158 field773;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lse;")
    public class167 field760;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Lvc;")
    public class192 field763;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lvd;")
    public static class193 field764;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Lef;")
    public class44 field767;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lkf;")
    public static class96 field783;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public final void method293(int arg0) {
        this.field767 = null;
        field781++;
        this.field763 = null;
        if (arg0 == 13869) {
            this.field769 = null;
            this.field760 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method294(byte arg0) {
        field782 = null;
        field783 = null;
        if (arg0 != -69) {
            field759 = null;
        }
        field773 = null;
        field764 = null;
        field759 = null;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static final void method295(int arg0) {
        if (class156.field2997 != null) {
            class156.field2997.method12((byte) -114);
        }
        field789++;
        if (arg0 <= 107) {
            method296(44, -84, -69, false);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZ)I")
    public static final int method296(int arg0, int arg1, int arg2, boolean arg3) {
        field761++;
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        int var6 = arg2 / arg1;
        int var7 = class68.method556(var6, var4, (byte) 83);
        int var8 = arg1 - 1 & arg2;
        int var9 = class68.method556(var6, var4 + 1, (byte) 83);
        int var10 = class68.method556(var6 + 1, var4, (byte) 83);
        int var11 = class68.method556(var6 + 1, var4 - -1, (byte) 83);
        int var12 = class124.method890(var9, var7, true, var5, arg1);
        int var13 = class124.method890(var11, var10, arg3, var5, arg1);
        return class124.method890(var13, var12, arg3, var8, arg1);
    }
}
