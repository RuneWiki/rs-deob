import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class165 {

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field1975 = class657.method3709(1);

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public int field1980 = class469.field6549;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "Ljava/lang/String;")
    public String field1976;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "Ljava/lang/String;")
    public String field1974;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public int field1984;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Ljava/lang/String;")
    public String field1977;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "Ljava/lang/String;")
    public String field1978;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "Ljava/lang/String;")
    public String field1979;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;II)V")
    public final void method994(int arg0, String arg1, String arg2, String arg3, byte arg4, String arg5, String arg6, int arg7, int arg8) {
        field1982++;
        this.field1975 = class657.method3709(1);
        this.field1981 = arg8;
        this.field1979 = arg3;
        this.field1976 = arg2;
        this.field1980 = class469.field6549;
        this.field1984 = arg7;
        if (arg4 >= -14) {
            this.method994(-114, null, null, null, (byte) 0, null, null, -76, -64);
        }
        this.field1977 = arg6;
        this.field1974 = arg1;
        this.field1978 = arg5;
        this.field1983 = arg0;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class165(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field1983 = arg0;
        this.field1976 = arg4;
        this.field1974 = arg5;
        this.field1981 = arg1;
        this.field1984 = arg6;
        this.field1977 = arg2;
        this.field1978 = arg7;
        this.field1979 = arg3;
    }
}
