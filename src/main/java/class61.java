import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class61 extends class173 {

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "Lld;")
    public class49 field799;

    @OriginalMember(owner = "client!pia", name = "A", descriptor = "Lai;")
    public class217 field800;

    @OriginalMember(owner = "client!pia", name = "x", descriptor = "Luw;")
    public static class208 field797 = new class208(124, 1);

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!pia", name = "t", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!pia", name = "u", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!pia", name = "v", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!pia", name = "y", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!pia", name = "B", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!pia", name = "C", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!pia", name = "D", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!pia", name = "E", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V", line = 5)
    public final void method358(byte arg0) {
        this.field802 = this.field799.field650;
        field791++;
        this.field803 = this.field799.field643;
        this.field792 = this.field799.field640;
        if (this.field799.field646 != null) {
            this.field799.field646.method460(this.field800.field2957, this.field800.field2960, this.field800.field2965, class779.field10639);
        }
        if (arg0 <= 65) {
            this.method358((byte) -43);
        }
        this.field796 = class779.field10639[2];
        this.field793 = class779.field10639[0];
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIIB)V", line = 29)
    public static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 > -117) {
            method360(true, 9);
        }
        field801++;
        if (arg2 == arg3) {
            class126.method737(arg4, arg0, arg1, false, arg3);
        } else if ((arg0 - arg3) >= class498.field6390 && arg0 + arg3 <= class30.field274 && class80.field1131 <= (arg1 - arg2) && arg1 + arg2 <= class405.field5375) {
            class187.method1316(arg1, arg0, arg3, arg2, arg4, -5367);
        } else {
            class401.method2321(arg2, arg3, (byte) -26, arg0, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZI)V", line = 53)
    public static final void method360(boolean arg0, int arg1) {
        field794++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class298.field3765 = arg1;
        if (arg0) {
            method361((byte) -54);
        }
        class358.field4375 = new class513[class251.field3424[class298.field3765] + 1];
        class246.field3375 = 0;
        class43.field490 = 0;
    }

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "(B)Lsf;", line = 72)
    public static final class551 method361(byte arg0) {
        field795++;
        if (arg0 >= -80) {
            return null;
        }
        class80 var1 = null;
        class551 var2 = new class551(class201.field2799, 0);
        try {
            class339 var3 = class740.field10014.method4234("", true, 0);
            while (var3.field4144 == 0) {
                class591.method3181(1L, 0);
            }
            if (var3.field4144 == 1) {
                var1 = (class80) var3.field4142;
                byte[] var4 = new byte[(int) var1.method497((byte) 124)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method499(var4.length - var5, var4, var5, true);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class551(new class234(var4), class201.field2799, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method503((byte) 61);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 127)
    public static void method362(int arg0) {
        field797 = null;
        if (arg0 >= -81) {
            field804 = 87;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZIII)V", line = 143)
    public static final void method363(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            return;
        }
        if (class80.field1131 <= arg3 && class405.field5375 >= arg3) {
            int var5 = class774.method4226(class498.field6390, (byte) -92, class30.field274, arg4);
            int var6 = class774.method4226(class498.field6390, (byte) -50, class30.field274, arg2);
            class321.method1865(arg3, var5, arg0, -19, var6);
        }
        field798++;
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lld;Lnia;)V", line = 163)
    public class61(class49 arg0, class513 arg1) {
        this.field799 = arg0;
        this.field800 = this.field799.method316(false);
        this.method358((byte) 120);
    }
}
