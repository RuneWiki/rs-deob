import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class717 {
   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "Lega;"
   )
   public class738 field10366 = class185.field2801;
   @OriginalMember(
      owner = "client!kb",
      name = "c",
      descriptor = "Lrfa;"
   )
   public class209 field10365;
   @OriginalMember(
      owner = "client!kb",
      name = "d",
      descriptor = "Ltv;"
   )
   public class584 field10368;
   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "Lvea;"
   )
   public class287 field10367;
   @OriginalMember(
      owner = "client!kb",
      name = "e",
      descriptor = "Z"
   )
   public boolean field10364;

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(BLega;)V",
      line = 5
   )
   public void method460(byte arg0, class738 arg1) {
      if (arg0 > 0) {
         this.method460((byte)-123, (class738)null);
      }

      this.field10366 = arg1;
   }

   @OriginalMember(
      owner = "client!kb",
      name = "<init>",
      descriptor = "(Lvea;Ltv;Lrfa;ZI)V",
      line = 21
   )
   public class717(class287 arg0, class584 arg1, class209 arg2, boolean arg3, int arg4) {
      this.field10365 = arg2;
      this.field10368 = arg1;
      this.field10367 = arg0;
      this.field10364 = arg3;
   }

   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;"
   )
   public abstract IDirect3DBaseTexture method835(boolean arg0);
}
