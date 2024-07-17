import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LLORVYLP")
public class Metadata {

    @OriginalMember(owner = "LLORVYLP", name = "o", descriptor = "I")
    public int faceAlphasOffset;

    @OriginalMember(owner = "LLORVYLP", name = "l", descriptor = "I")
    public int faceColorsOffset;

    @OriginalMember(owner = "LLORVYLP", name = "c", descriptor = "I")
    public int faceCount;

    @OriginalMember(owner = "LLORVYLP", name = "m", descriptor = "I")
    public int faceInfosOffset;

    @OriginalMember(owner = "LLORVYLP", name = "p", descriptor = "I")
    public int faceLabelsOffset;

    @OriginalMember(owner = "LLORVYLP", name = "k", descriptor = "I")
    public int faceOrientationsOffset;

    @OriginalMember(owner = "LLORVYLP", name = "n", descriptor = "I")
    public int facePrioritiesOffset;

    @OriginalMember(owner = "LLORVYLP", name = "q", descriptor = "I")
    public int faceTextureAxisOffset;

    @OriginalMember(owner = "LLORVYLP", name = "j", descriptor = "I")
    public int faceVerticesOffset;

    @OriginalMember(owner = "LLORVYLP", name = "d", descriptor = "I")
    public int texturedFaceCount;

    @OriginalMember(owner = "LLORVYLP", name = "b", descriptor = "I")
    public int vertexCount;

    @OriginalMember(owner = "LLORVYLP", name = "e", descriptor = "I")
    public int vertexFlagsOffset;

    @OriginalMember(owner = "LLORVYLP", name = "i", descriptor = "I")
    public int vertexLabelsOffset;

    @OriginalMember(owner = "LLORVYLP", name = "f", descriptor = "I")
    public int vertexXOffset;

    @OriginalMember(owner = "LLORVYLP", name = "g", descriptor = "I")
    public int vertexYOffset;

    @OriginalMember(owner = "LLORVYLP", name = "h", descriptor = "I")
    public int vertexZOffset;

    @OriginalMember(owner = "LLORVYLP", name = "a", descriptor = "[B")
    public byte[] data;
}
