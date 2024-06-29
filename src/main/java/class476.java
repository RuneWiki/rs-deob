import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class476 extends class271 {

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "Lat;")
    public class255 field7007;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Lrp;")
    public class299 field7000;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field6999 = 0;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public int field6996;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public int field7001;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public int field7002;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public int field7005;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public int field7006;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method2840(int arg0) {
        this.field7002 = this.field7007.field3773;
        this.field6996 = this.field7007.field3776;
        this.field7001 = this.field7007.field3782;
        if (arg0 != -25438) {
            return;
        }
        field6998++;
        if (this.field7007.field3774 != null) {
            this.field7007.field3774.method912(this.field7000.field4249, this.field7000.field4246, this.field7000.field4251, class101.field1463);
        }
        this.field7005 = class101.field1463[0];
        this.field7006 = class101.field1463[2];
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)I")
    public static final int method2841(int arg0, boolean arg1) {
        int var7 = arg0 - 1;
        if (!arg1) {
            method2841(6, false);
        }
        field6997++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lat;Lce;)V")
    public class476(class255 arg0, class201 arg1) {
        this.field7007 = arg0;
        this.field7000 = this.field7007.method1705((byte) 108);
        this.method2840(-25438);
    }
}
