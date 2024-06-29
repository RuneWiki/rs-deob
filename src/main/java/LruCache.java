import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RHNYLZZL")
public class LruCache {

    @OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "I")
    private int field1371 = 256;

    @OriginalMember(owner = "client!RHNYLZZL", name = "d", descriptor = "LDPPNUUMQ;")
    private DoublyLinkable field1374 = new DoublyLinkable();

    @OriginalMember(owner = "client!RHNYLZZL", name = "h", descriptor = "LCZYJUOKA;")
    private DoublyLinkList field1378 = new DoublyLinkList(true);

    @OriginalMember(owner = "client!RHNYLZZL", name = "e", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!RHNYLZZL", name = "f", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client!RHNYLZZL", name = "g", descriptor = "LJLFXAIRK;")
    private HashTable field1377;

    @OriginalMember(owner = "client!RHNYLZZL", name = "b", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client!RHNYLZZL", name = "c", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!RHNYLZZL", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field1375 = arg0;
        if (arg1 >= 0) {
            this.field1371 = 433;
        }
        this.field1376 = arg0;
        this.field1377 = new HashTable((byte) 0, 1024);
    }

    @OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "(J)LDPPNUUMQ;")
    public DoublyLinkable method458(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field1377.method259(arg0);
        if (var3 == null) {
            this.field1372++;
        } else {
            this.field1378.method180(var3);
            this.field1373++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "(LDPPNUUMQ;JI)V")
    public void method459(DoublyLinkable arg0, long arg1, int arg2) {
        if (arg2 != 5) {
            this.field1371 = 150;
        }
        if (this.field1376 == 0) {
            DoublyLinkable var5 = this.field1378.method181();
            var5.method604();
            var5.method185();
            if (this.field1374 == var5) {
                DoublyLinkable var6 = this.field1378.method181();
                var6.method604();
                var6.method185();
            }
        } else {
            this.field1376--;
        }
        this.field1377.method260(6, arg0, arg1);
        this.field1378.method180(arg0);
        if (Linkable.field1772) {
        }
    }

    @OriginalMember(owner = "client!RHNYLZZL", name = "a", descriptor = "()V")
    public void method460() {
        while (true) {
            DoublyLinkable var1 = this.field1378.method181();
            if (var1 == null) {
                this.field1376 = this.field1375;
                return;
            }
            var1.method604();
            var1.method185();
        }
    }
}
