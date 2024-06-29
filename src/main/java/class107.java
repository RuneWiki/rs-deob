import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public abstract class class107 {

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Lvl;")
    public static class15 field1694 = new class15(38, 8);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public abstract void method916(int arg0);

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public abstract void method917(int arg0);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public static final void method918(byte arg0) {
        field1693++;
        for (class430 var1 = (class430) class524.field7128.method335(-29067); var1 != null; var1 = (class430) class524.field7128.method336(123)) {
            if (var1.field5868.method709((byte) -98)) {
                class768.method4227(-18974, var1.field5867);
            } else {
                var1.field5868.method21(0);
                try {
                    var1.field5868.method705(false);
                } catch (Exception var6) {
                    class281.method1820("TV: " + var1.field5867, 28395, var6);
                    class768.method4227(-18974, var1.field5867);
                }
                if (!var1.field5865 && !var1.field5860) {
                    class784 var3 = var1.field5868.method703((byte) -110);
                    if (var3 != null) {
                        class745 var4 = var3.method4280(-104);
                        if (var4 != null) {
                            var4.method4140(256, var1.field5862);
                            class456.field6213.method350(var4);
                            var1.field5865 = true;
                        }
                    }
                }
            }
        }
        int var5 = 97 / ((-arg0 - 23) / 57);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BI)V")
    public abstract void method919(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
    public static void method920(int arg0) {
        field1694 = null;
        if (arg0 != 38) {
            method918((byte) -61);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method921(boolean arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB[BI)I")
    public abstract int method922(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException;
}
