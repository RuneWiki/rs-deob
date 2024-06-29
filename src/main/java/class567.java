import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class class567 {
   @OriginalMember(
      owner = "client!ir",
      name = "b",
      descriptor = "Lpi;"
   )
   public class427 field8405 = class168.field2573;
   @OriginalMember(
      owner = "client!ir",
      name = "d",
      descriptor = "Lpc;"
   )
   public class650 field8403;
   @OriginalMember(
      owner = "client!ir",
      name = "c",
      descriptor = "Leh;"
   )
   public class19 field8406;
   @OriginalMember(
      owner = "client!ir",
      name = "e",
      descriptor = "Leb;"
   )
   public class163 field8407;
   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "Z"
   )
   public boolean field8404;

   @OriginalMember(
      owner = "client!ir",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public abstract IDirect3DBaseTexture method215(byte arg0);

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(ILpi;)V"
   )
   public void method216(int arg0, class427 arg1) {
      this.field8405 = arg1;
      if (arg0 < 125) {
         this.field8403 = (class650)null;
      }

   }

   @OriginalMember(
      owner = "client!ir",
      name = "<init>",
      descriptor = "(Leb;Leh;Lpc;ZI)V"
   )
   public class567(class163 arg0, class19 arg1, class650 arg2, boolean arg3, int arg4) {
      this.field8403 = arg2;
      this.field8406 = arg1;
      this.field8407 = arg0;
      this.field8404 = arg3;
   }
}
