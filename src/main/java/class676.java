import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class class676 {
   @OriginalMember(
      owner = "client!hca",
      name = "e",
      descriptor = "Lmb;"
   )
   public class359 field9461 = class391.field5689;
   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "Lsr;"
   )
   public class78 field9462;
   @OriginalMember(
      owner = "client!hca",
      name = "b",
      descriptor = "Lmv;"
   )
   public class125 field9460;
   @OriginalMember(
      owner = "client!hca",
      name = "d",
      descriptor = "Z"
   )
   public boolean field9464;
   @OriginalMember(
      owner = "client!hca",
      name = "c",
      descriptor = "Lob;"
   )
   public class779 field9463;

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(Lmb;B)V"
   )
   public void method1075(class359 arg0, byte arg1) {
      if (arg1 != 34) {
         this.method1075((class359)null, (byte)98);
      }

      this.field9461 = arg0;
   }

   @OriginalMember(
      owner = "client!hca",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public abstract IDirect3DBaseTexture method4596(byte arg0);

   @OriginalMember(
      owner = "client!hca",
      name = "<init>",
      descriptor = "(Lmv;Lsr;Lob;ZI)V"
   )
   public class676(class125 arg0, class78 arg1, class779 arg2, boolean arg3, int arg4) {
      this.field9462 = arg1;
      this.field9460 = arg0;
      this.field9464 = arg3;
      this.field9463 = arg2;
   }
}
