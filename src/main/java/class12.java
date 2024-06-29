import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class12 extends class34 {

    @OriginalMember(owner = "mapview!ga", name = "t", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "mapview!ga", name = "w", descriptor = "Lj;")
    public static class17 field231 = class30.method190(-118, "Mini)2Game");

    @OriginalMember(owner = "mapview!ga", name = "s", descriptor = "Lj;")
    public static class17 field227 = class30.method190(-99, "Rare Trees");

    @OriginalMember(owner = "mapview!ga", name = "x", descriptor = "Lj;")
    public static class17 field232 = class30.method190(-117, "37(U");

    @OriginalMember(owner = "mapview!ga", name = "v", descriptor = "Lj;")
    public static class17 field230 = class30.method190(-112, "Bank");

    @OriginalMember(owner = "mapview!ga", name = "y", descriptor = "Lj;")
    public static class17 field233 = class30.method190(-109, "codeversion");

    @OriginalMember(owner = "mapview!ga", name = "u", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "([BZZ)V", line = 4)
    public class12(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "([BZZZ)V", line = 28)
    private class12(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method99(new DataInputStream(new ByteArrayInputStream(arg0)), arg3, -33554433);
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(Z)V", line = 42)
    public static void method98(boolean arg0) {
        if (arg0) {
            method98(false);
        }
        field232 = null;
        field233 = null;
        field231 = null;
        field230 = null;
        field227 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ljava/io/DataInputStream;ZI)V", line = 76)
    private final void method99(DataInputStream arg0, boolean arg1, int arg2) throws IOException {
        if (!arg1) {
        }
        if (arg2 != -33554433) {
            field230 = (class17) null;
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class33 var7 = new class33(var5 + 5);
        var7.method217(var4, arg2 + 33554465);
        var7.method220(var6, false);
        arg0.readFully(var7.field418, var7.field410, var5);
        this.method233(true, var7.field418);
        for (int var8 = 0; super.field433 > var8; ++var8) {
            int var9 = arg0.read();
            int var10 = arg0.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class33 var12 = new class33(var10 - -5);
            var12.method217(var9, 25);
            var12.method220(var11, false);
            while (-33554433 > ~var10) {
                arg0.readFully(var12.field418, var12.field410, 33554432);
                var12.field410 += 33554432;
                var10 -= 33554432;
            }
            arg0.readFully(var12.field418, var12.field410, var10);
            super.field440[super.field423[var8]] = var12.field418;
        }
    }
}
