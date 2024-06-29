import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class119 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lbg;B)Lsb;")
    public static final class194 method792(class242 arg0, byte arg1) {
        arg0.method1563(-128);
        field1377++;
        int var2 = arg0.method1563(-128);
        int var3 = 85 % ((-arg1 - 9) / 50);
        class194 var4 = class416.method2558(true, var2);
        var4.field2282 = arg0.method1563(-128);
        int var5 = arg0.method1563(-128);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg0.method1563(-128);
            var4.method54(var7, -53, arg0);
        }
        var4.method280(100);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public abstract void method793(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Luo;Ljn;I)I")
    public static final int method794(class118 arg0, class352 arg1, int arg2) {
        if (arg2 < 43) {
            return -89;
        }
        field1372++;
        if (arg1.field4791 != -1) {
            return arg1.field4791;
        }
        if (arg1.field4780 != -1) {
            class358 var3 = class450.field6292.method960(arg0.method726() ? arg1.field4780 : arg1.field4794, (byte) -40);
            if (!var3.field4862) {
                return var3.field4864;
            }
        }
        return arg1.field4787;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)V")
    public abstract void method795(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)V")
    public abstract void method796(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLwo;)V")
    public static final void method797(boolean arg0, class285 arg1) {
        if (!arg0) {
            field1373 = 66;
        }
        field1374++;
        class446.field6254 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static final void method798(int arg0) {
        class275.field3563++;
        class427.field5837.method2162(false, 218);
        field1371++;
        if (arg0 <= -6) {
            class427.field5837.method1573(-6266, class219.field2703);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V")
    public class119(int arg0, int arg1, int arg2) {
        this.field1375 = arg2;
        this.field1378 = arg0;
        this.field1376 = arg1;
    }
}
