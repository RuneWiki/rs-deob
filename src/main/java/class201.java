import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public interface class201 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I")
    int method759(byte arg0);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)J")
    long method757(boolean arg0);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
    int method755(int arg0);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)V")
    void method760(byte[] arg0, int arg1, int arg2, int arg3);
}
