import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class717 {
   @OriginalMember(
      owner = "client!rl",
      name = "b",
      descriptor = "Lrj;"
   )
   public class782 field10518 = class206.field2625;
   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "Lub;"
   )
   public class165 field10517;
   @OriginalMember(
      owner = "client!rl",
      name = "e",
      descriptor = "Z"
   )
   public boolean field10519;
   @OriginalMember(
      owner = "client!rl",
      name = "c",
      descriptor = "Lwn;"
   )
   public class576 field10516;
   @OriginalMember(
      owner = "client!rl",
      name = "d",
      descriptor = "Ldja;"
   )
   public class45 field10515;

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(Lrj;B)V"
   )
   public void method2868(class782 arg0, byte arg1) {
      this.field10518 = arg0;
      if (arg1 != -57) {
         this.method3244((byte)88);
      }

   }

   @OriginalMember(
      owner = "client!rl",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public abstract IDirect3DBaseTexture method3244(byte arg0);

   @OriginalMember(
      owner = "client!rl",
      name = "<init>",
      descriptor = "(Lub;Ldja;Lwn;ZI)V"
   )
   public class717(class165 arg0, class45 arg1, class576 arg2, boolean arg3, int arg4) {
      this.field10517 = arg0;
      this.field10519 = arg3;
      this.field10516 = arg2;
      this.field10515 = arg1;
   }
}
