import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LLORVYLP")
public class Metadata {

    @OriginalMember(owner = "client!LLORVYLP", name = "o", descriptor = "I")
    public int faceAlphasOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "l", descriptor = "I")
    public int faceColorsOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "c", descriptor = "I")
    public int faceCount;

    @OriginalMember(owner = "client!LLORVYLP", name = "m", descriptor = "I")
    public int faceInfosOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "p", descriptor = "I")
    public int faceLabelsOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "k", descriptor = "I")
    public int faceOrientationsOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "n", descriptor = "I")
    public int facePrioritiesOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "q", descriptor = "I")
    public int faceTextureAxisOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "j", descriptor = "I")
    public int faceVerticesOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "d", descriptor = "I")
    public int texturedFaceCount;

    @OriginalMember(owner = "client!LLORVYLP", name = "b", descriptor = "I")
    public int vertexCount;

    @OriginalMember(owner = "client!LLORVYLP", name = "e", descriptor = "I")
    public int vertexFlagsOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "i", descriptor = "I")
    public int vertexLabelsOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "f", descriptor = "I")
    public int vertexXOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "g", descriptor = "I")
    public int vertexYOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "h", descriptor = "I")
    public int vertexZOffset;

    @OriginalMember(owner = "client!LLORVYLP", name = "a", descriptor = "[B")
    public byte[] data;
}
