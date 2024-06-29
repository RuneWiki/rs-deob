import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class100 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lpj;")
    public static class237 field1775 = class33.method353("Loaded world list data", 112);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1779 = 0;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1782 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Leh;")
    public static class80 field1781;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Ljd;")
    public static class86 field1777;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)[Lcj;")
    public static final class115[] method760(int arg0) {
        class115[] var1 = new class115[class92.field1668];
        field1774++;
        for (int var2 = arg0; var2 < class92.field1668; var2++) {
            int var3 = class175.field3063[var2] * class174.field3060[var2];
            byte[] var4 = class127.field2221[var2];
            if (class124.field2184[var2]) {
                int[] var5 = new int[var3];
                byte[] var6 = class69.field1364[var2];
                for (int var7 = 0; var7 < var3; var7++) {
                    var5[var7] = class34.method362(class139.field2398[class272.method1817(255, var4[var7])], class272.method1817(255, var6[var7]) << 24);
                }
                var1[var2] = new class109(class52.field1094, class43.field944, class252.field4341[var2], class226.field3868[var2], class174.field3060[var2], class175.field3063[var2], var5);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class139.field2398[class272.method1817(var4[var9], 255)];
                }
                var1[var2] = new class225(class52.field1094, class43.field944, class252.field4341[var2], class226.field3868[var2], class174.field3060[var2], class175.field3063[var2], var8);
            }
        }
        class190.method1291((byte) 103);
        return var1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1781 = null;
        field1775 = null;
        if (arg0 != 58) {
            method762(-20, -34, -20, true, -34);
        }
        field1777 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZI)V")
    public static final void method762(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field1779 = 18;
        }
        if (class13.field215 <= arg4 && class34.field727 >= arg4) {
            int var5 = class91.method689(arg0, class89.field1637, class94.field1676, (byte) -100);
            int var6 = class91.method689(arg1, class89.field1637, class94.field1676, (byte) -116);
            class65.method537(arg4, var6, -102, arg2, var5);
        }
        field1780++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfa;Lfa;B)V")
    public static final void method763(class239 arg0, class239 arg1, byte arg2) {
        if (arg2 == -30) {
            class182.field3196 = arg0;
            field1776++;
            class17.field301 = arg1;
        }
    }
}
