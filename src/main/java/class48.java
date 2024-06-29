import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class48 {

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "Ljava/lang/String;")
    public String field690;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "Ljava/lang/String;")
    public String field692;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "J")
    public long field693;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lfba;")
    public static class25 field691 = new class25();

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "Loo;")
    public static class629 field697 = new class629(5, -1);

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 9)
    public static final void method355(String arg0, byte arg1) {
        field698++;
        if (arg1 != 23) {
            field691 = null;
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class712.method4064(-13, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class569.field8065; var3++) {
            String var4 = class254.field3654[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class712.method4064(-13, var4);
            if (var5 != null && var5.equals(var2)) {
                class569.field8065--;
                for (int var6 = var3; var6 < class569.field8065; var6++) {
                    class254.field3654[var6] = class254.field3654[var6 + 1];
                    class458.field6753[var6] = class458.field6753[var6 + 1];
                    class331.field4764[var6] = class331.field4764[var6 + 1];
                    class501.field7120[var6] = class501.field7120[var6 + 1];
                    class489.field6991[var6] = class489.field6991[var6 + 1];
                }
                class211.field3149 = class589.field8351;
                class592.field8414++;
                class468 var7 = class93.method734(class29.field284, class190.field2872, arg1 + 8151);
                var7.field6839.method3730(118, class574.method3322(arg0, 16383));
                var7.field6839.method3692(arg1 ^ 0x60, arg0);
                class120.method872((byte) 88, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V", line = 72)
    public static void method356(int arg0) {
        field697 = null;
        if (arg0 >= 115) {
            field691 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZILsca;I)V", line = 83)
    public static final void method357(boolean arg0, int arg1, class46 arg2, int arg3) {
        if (arg0) {
            class296.field4213 = arg3;
            field694++;
            class289.field4118 = arg2;
            class371.field5324 = arg1;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 104)
    public class48(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field690 = arg3;
        this.field696 = arg0;
        this.field692 = arg1;
        this.field693 = arg4;
        this.field695 = arg2;
    }
}
