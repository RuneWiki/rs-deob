import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class342 extends class408 {

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "Z")
    public boolean field4965;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "Ljava/lang/String;")
    public String field4969;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "J")
    public long field4959;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "J")
    public long field4971;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "Ljava/lang/String;")
    public String field4966;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "Z")
    public boolean field4958;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "Z")
    public boolean field4960;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "Ljava/lang/String;")
    public String field4964;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lvd;IIB)Ldh;")
    public static final class322 method2175(class39 arg0, int arg1, int arg2, byte arg3) {
        field4963++;
        if (arg3 == -126) {
            byte[] var4 = arg0.method211(true, arg2, arg1);
            return var4 == null ? null : new class322(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class342(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field4965 = arg9;
        this.field4972 = arg3;
        this.field4961 = arg4;
        this.field4967 = arg7;
        this.field4968 = arg2;
        this.field4962 = arg6;
        this.field4969 = arg1;
        this.field4959 = arg10;
        this.field4971 = arg5;
        this.field4966 = arg0;
        this.field4958 = arg11;
        this.field4960 = arg8;
    }
}
