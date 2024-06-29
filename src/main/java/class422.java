import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class422 {
   @OriginalMember(
      owner = "client!ga",
      name = "e",
      descriptor = "Luh;"
   )
   public class176 field6417 = class524.field7600;
   @OriginalMember(
      owner = "client!ga",
      name = "c",
      descriptor = "Z"
   )
   public boolean field6416;
   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "Lef;"
   )
   public class513 field6414;
   @OriginalMember(
      owner = "client!ga",
      name = "d",
      descriptor = "Lfi;"
   )
   public class582 field6415;
   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "Lii;"
   )
   public class579 field6413;

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(ILuh;)V",
      line = 5
   )
   public void method1914(int arg0, class176 arg1) {
      if (arg0 == -15226) {
         this.field6417 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "<init>",
      descriptor = "(Lfi;Lii;Lef;ZI)V",
      line = 21
   )
   public class422(class582 arg0, class579 arg1, class513 arg2, boolean arg3, int arg4) {
      this.field6416 = arg3;
      this.field6414 = arg2;
      this.field6415 = arg0;
      this.field6413 = arg1;
   }

   @OriginalMember(
      owner = "client!ga",
      name = "e",
      descriptor = "(I)Ljagdx/IDirect3DBaseTexture;"
   )
   public abstract IDirect3DBaseTexture method2911(int arg0);
}
