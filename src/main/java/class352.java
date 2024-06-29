import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class352 {
   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "I"
   )
   public int field5359;
   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "I"
   )
   public int field5358;
   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "I"
   )
   public int field5360;

   @OriginalMember(
      owner = "client!pca",
      name = "<init>",
      descriptor = "()V",
      line = 5
   )
   public class352() {
   }

   @OriginalMember(
      owner = "client!pca",
      name = "<init>",
      descriptor = "(Lpca;)V",
      line = 7
   )
   public class352(class352 arg0) {
      this.field5359 = arg0.field5359;
      this.field5358 = arg0.field5358;
      this.field5360 = arg0.field5360;
   }
}
