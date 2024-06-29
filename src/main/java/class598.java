import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class class598 {
   @OriginalMember(
      owner = "client!cv",
      name = "c",
      descriptor = "Lrb;"
   )
   public class374 field8324 = class213.field2642;
   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "Lvn;"
   )
   public class332 field8326;
   @OriginalMember(
      owner = "client!cv",
      name = "e",
      descriptor = "Liw;"
   )
   public class335 field8328;
   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "Ltga;"
   )
   public class63 field8325;
   @OriginalMember(
      owner = "client!cv",
      name = "d",
      descriptor = "Z"
   )
   public boolean field8327;

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public abstract IDirect3DBaseTexture method43(byte arg0);

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(Lrb;B)V"
   )
   public void method40(class374 arg0, byte arg1) {
      int var3 = 9 % ((arg1 - -72) / 37);
      this.field8324 = arg0;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "<init>",
      descriptor = "(Lvn;Ltga;Liw;ZI)V"
   )
   public class598(class332 arg0, class63 arg1, class335 arg2, boolean arg3, int arg4) {
      this.field8326 = arg0;
      this.field8328 = arg2;
      this.field8325 = arg1;
      this.field8327 = arg3;
   }
}
