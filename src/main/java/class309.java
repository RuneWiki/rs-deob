import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public abstract class class309 {
   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "Lgj;"
   )
   public class663 field4254 = class711.field10376;
   @OriginalMember(
      owner = "client!tha",
      name = "d",
      descriptor = "Lak;"
   )
   public class371 field4253;
   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "Lria;"
   )
   public class301 field4252;
   @OriginalMember(
      owner = "client!tha",
      name = "e",
      descriptor = "Z"
   )
   public boolean field4251;
   @OriginalMember(
      owner = "client!tha",
      name = "c",
      descriptor = "Lbb;"
   )
   public class353 field4250;

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(ILgj;)V",
      line = 8
   )
   public void method1425(int arg0, class663 arg1) {
      if (arg0 <= -116) {
         this.field4254 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "<init>",
      descriptor = "(Lbb;Lak;Lria;ZI)V",
      line = 21
   )
   public class309(class353 arg0, class371 arg1, class301 arg2, boolean arg3, int arg4) {
      this.field4253 = arg1;
      this.field4252 = arg2;
      this.field4251 = arg3;
      this.field4250 = arg0;
   }

   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public abstract IDirect3DBaseTexture method1424(byte arg0);
}
