import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public abstract class class513 {

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Leba;")
    public static class550 field7143 = new class550(0, 10);

    @OriginalMember(owner = "client!it", name = "f", descriptor = "[Lkba;")
    public static class573[] field7145 = new class573[2048];

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Llg;")
    public static class32 field7144 = new class32(7, 0, 1, 1);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2902(byte arg0) {
        int var1 = -99 / ((19 - arg0) / 59);
        field7141++;
        class611 var2 = null;
        try {
            class661 var3 = class312.field4206.method2236("3", (byte) -106, false);
            while (var3.field9420 == 0) {
                class588.method3253(0, 1L);
            }
            if (var3.field9420 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var2 = (class611) var3.field9421;
            byte[] var4 = new byte[(int) var2.method3387(-112)];
            if (var4.length == 0) {
                class351.field4667 = "";
                class618.field8577 = "";
            } else {
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method3386(var4.length - var5, 0, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class157 var7 = new class157(var4);
                int var8 = var7.method930(255);
                if (var8 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var7.field2219 = var8 + 1;
                if (!var7.method941(4)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var7.field2219 = 1;
                int var9 = var7.method930(255);
                if (var9 > 3) {
                    throw new RuntimeException("Invalid version " + var9);
                }
                class618.field8577 = var7.method907((byte) 23);
                class351.field4667 = var7.method907((byte) 114);
                if (var9 < 1) {
                    class284.field3759 = class190.field2640;
                } else {
                    class284.field3759 = var7.method963(-127);
                }
                if (var9 >= 2) {
                    class258.field3373 = var7.method953(true);
                } else {
                    class258.field3373 = class478.field6658;
                }
                if (var9 < 3) {
                    class329.field4416 = class200.field2710;
                } else if (var7.method930(255) == 1) {
                    class329.field4416 = var7.method907((byte) 66);
                } else {
                    class329.field4416 = null;
                }
            }
        } catch (Exception var11) {
            class618.field8577 = "";
            class351.field4667 = "";
        }
        try {
            if (var2 != null) {
                var2.method3390(0);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V", line = 103)
    public static void method2903(boolean arg0) {
        field7144 = null;
        field7143 = null;
        field7145 = null;
        if (arg0) {
            method2903(true);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V", line = 117)
    public static final void method2904(int arg0, int arg1) {
        field7140++;
        if (arg0 >= -35) {
            field7143 = null;
        }
        class90.field1099 = arg1;
        class642.field8878.method2168((byte) -91);
    }
}
