import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NQQFCAPC")
public class class36 {

    @OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "I")
    private int field1206 = 36795;

    @OriginalMember(owner = "client!NQQFCAPC", name = "b", descriptor = "B")
    private byte field1207 = 5;

    @OriginalMember(owner = "client!NQQFCAPC", name = "e", descriptor = "LOZZFMONJ;")
    private class42 field1210 = new class42();

    @OriginalMember(owner = "client!NQQFCAPC", name = "i", descriptor = "LEZRJDJYN;")
    private class18 field1214 = new class18(5);

    @OriginalMember(owner = "client!NQQFCAPC", name = "f", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!NQQFCAPC", name = "g", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!NQQFCAPC", name = "h", descriptor = "LBCCRZRYI;")
    private class6 field1213;

    @OriginalMember(owner = "client!NQQFCAPC", name = "c", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!NQQFCAPC", name = "d", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!NQQFCAPC", name = "<init>", descriptor = "(II)V")
    public class36(int arg0, int arg1) {
        this.field1211 = arg0;
        this.field1212 = arg0;
        int var3 = 21 / arg1;
        this.field1213 = new class6(1024, 40545);
    }

    @OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "(J)LOZZFMONJ;")
    public class42 method334(long arg0) {
        class42 var3 = (class42) this.field1213.method39(arg0);
        if (var3 == null) {
            this.field1208++;
        } else {
            this.field1214.method190(var3);
            this.field1209++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "(IJLOZZFMONJ;)V")
    public void method335(int arg0, long arg1, class42 arg2) {
        if (this.field1212 == 0) {
            class42 var5 = this.field1214.method191();
            var5.method41();
            var5.method371();
            if (this.field1210 == var5) {
                class42 var6 = this.field1214.method191();
                var6.method41();
                var6.method371();
            }
        } else {
            this.field1212--;
        }
        this.field1213.method40(arg1, this.field1207, arg2);
        this.field1214.method190(arg2);
        int var7 = 11 / arg0;
        if (class7.field142) {
        }
    }

    @OriginalMember(owner = "client!NQQFCAPC", name = "a", descriptor = "()V")
    public void method336() {
        while (true) {
            class42 var1 = this.field1214.method191();
            if (var1 == null) {
                this.field1212 = this.field1211;
                return;
            }
            var1.method41();
            var1.method371();
        }
    }
}
