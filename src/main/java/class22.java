import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GQDAZHGX")
public class class22 {

    @OriginalMember(owner = "client!GQDAZHGX", name = "a", descriptor = "I")
    private int field806 = 6;

    @OriginalMember(owner = "client!GQDAZHGX", name = "i", descriptor = "Z")
    public boolean field814 = false;

    @OriginalMember(owner = "client!GQDAZHGX", name = "j", descriptor = "Z")
    public boolean field815 = true;

    @OriginalMember(owner = "client!GQDAZHGX", name = "l", descriptor = "Z")
    public boolean field817 = false;

    @OriginalMember(owner = "client!GQDAZHGX", name = "o", descriptor = "Z")
    public boolean field820 = false;

    @OriginalMember(owner = "client!GQDAZHGX", name = "p", descriptor = "I")
    public int field821 = -1;

    @OriginalMember(owner = "client!GQDAZHGX", name = "q", descriptor = "Z")
    public boolean field822 = true;

    @OriginalMember(owner = "client!GQDAZHGX", name = "b", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!GQDAZHGX", name = "d", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!GQDAZHGX", name = "g", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!GQDAZHGX", name = "h", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!GQDAZHGX", name = "k", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!GQDAZHGX", name = "m", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!GQDAZHGX", name = "n", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!GQDAZHGX", name = "f", descriptor = "Ljava/lang/String;")
    public String field811;

    @OriginalMember(owner = "client!GQDAZHGX", name = "e", descriptor = "[I")
    public static int[] field810;

    @OriginalMember(owner = "client!GQDAZHGX", name = "c", descriptor = "[LGQDAZHGX;")
    public static class22[] field808;

    @OriginalMember(owner = "client!GQDAZHGX", name = "a", descriptor = "(LNXFIIFAD;I)V")
    public static void method213(class41 arg0, int arg1) {
        class37 var2 = new class37(arg0.method431("varp.dat", null), -670);
        if (arg1 != 24570) {
            return;
        }
        field809 = 0;
        field807 = var2.method388();
        if (field808 == null) {
            field808 = new class22[field807];
        }
        if (field810 == null) {
            field810 = new int[field807];
        }
        for (int var3 = 0; var3 < field807; var3++) {
            if (field808[var3] == null) {
                field808[var3] = new class22();
            }
            field808[var3].method214(var2, false, var3);
        }
        if (var2.field1211.length != var2.field1212) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!GQDAZHGX", name = "a", descriptor = "(LMNKDCXXG;ZI)V")
    public void method214(class37 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field806 = -90;
        }
        while (true) {
            int var4 = arg0.method386();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field812 = arg0.method386();
            } else if (var4 == 2) {
                this.field813 = arg0.method386();
            } else if (var4 == 3) {
                this.field814 = true;
                field810[field809++] = arg2;
            } else if (var4 == 4) {
                this.field815 = false;
            } else if (var4 == 5) {
                this.field816 = arg0.method388();
            } else if (var4 == 6) {
                this.field817 = true;
            } else if (var4 == 7) {
                this.field818 = arg0.method391();
            } else if (var4 == 8) {
                this.field819 = 1;
                this.field820 = true;
            } else if (var4 == 10) {
                this.field811 = arg0.method393();
            } else if (var4 == 11) {
                this.field820 = true;
            } else if (var4 == 12) {
                this.field821 = arg0.method391();
            } else if (var4 == 13) {
                this.field819 = 2;
                this.field820 = true;
            } else if (var4 == 14) {
                this.field822 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
