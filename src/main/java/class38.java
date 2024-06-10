import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!r")
public class class38 implements Runnable {
   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "Ljava/applet/Applet;"
   )
   public Applet field272 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "b",
      descriptor = "Lk;"
   )
   public class24 field273 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "c",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field274;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "d",
      descriptor = "Z"
   )
   private boolean field275 = false;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "e",
      descriptor = "Lk;"
   )
   public class24 field276 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "f",
      descriptor = "Lta;"
   )
   private class43 field277 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "g",
      descriptor = "Lta;"
   )
   private class43 field278 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public static String field279;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "i",
      descriptor = "[Lk;"
   )
   public class24[] field280;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public static String field281;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "k",
      descriptor = "Ljava/io/File;"
   )
   public File field282 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "l",
      descriptor = "I"
   )
   public static int field283 = 3;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "m",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field284;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "n",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field285;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "o",
      descriptor = "Ljava/io/File;"
   )
   private File field286 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   private static String field287;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "q",
      descriptor = "Lk;"
   )
   public class24 field288 = null;
   @OriginalMember(
      owner = "loginapplet!r",
      name = "r",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field289;

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(Ljava/net/URL;I)Lta;",
      line = 6
   )
   public final class43 method178(URL arg0, int arg1) {
      try {
         if (arg1 != 2) {
            this.method185((String)null, (byte)-106, 77);
         }

         return this.method182(-33, 0, 4, 0, arg0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;II)Lta;",
      line = 16
   )
   public final class43 method179(Runnable arg0, int arg1, int arg2) {
      try {
         if (arg1 != 2) {
            field283 = -123;
         }

         return this.method182(-33, arg2, 2, 0, arg0);
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "run",
      descriptor = "()V",
      line = 32
   )
   public final void run() {
      try {
         while(true) {
            class43 var1;
            synchronized(this) {
               while(true) {
                  if (this.field275) {
                     return;
                  }

                  if (this.field277 != null) {
                     var1 = this.field277;
                     this.field277 = this.field277.field328;
                     if (this.field277 == null) {
                        this.field278 = null;
                     }
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var7) {
                  }
               }
            }

            try {
               int var2 = var1.field325;
               if (1 == var2) {
                  var1.field324 = new Socket(InetAddress.getByName((String)var1.field329), var1.field326);
               } else if (2 == var2) {
                  Thread var3 = new Thread((Runnable)var1.field329);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.field326);
                  var1.field324 = var3;
               } else if (var2 == 4) {
                  var1.field324 = new DataInputStream(((URL)var1.field329).openStream());
               } else {
                  Object[] var10;
                  if (var2 == 8) {
                     var10 = (Object[])((Object[])var1.field329);
                     var1.field324 = ((Class)var10[0]).getDeclaredMethod((String)var10[1], (Class[])((Class[])var10[2]));
                  } else {
                     if (~var2 != -10) {
                        throw new Exception();
                     }

                     var10 = (Object[])((Object[])var1.field329);
                     var1.field324 = ((Class)var10[0]).getDeclaredField((String)var10[1]);
                  }
               }

               var1.field327 = 1;
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               var1.field327 = 2;
            }
         }
      } catch (RuntimeException var9) {
         throw var9;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lta;",
      line = 127
   )
   public final class43 method180(Class arg0, Class[] arg1, String arg2, byte arg3) {
      try {
         if (arg3 != -26) {
            this.method181(55, 48, (String)null, -38);
         }

         return this.method182(arg3 ^ 57, 0, 8, 0, new Object[]{arg0, arg2, arg1});
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(IILjava/lang/String;I)V",
      line = 140
   )
   private final void method181(int arg0, int arg1, String arg2, int arg3) {
      try {
         if (-33 < ~arg0 || arg0 > 34) {
            arg0 = 32;
         }

         String[] var6 = new String[]{".jagex_cache_" + arg0, ".file_store_" + arg0};
         String[] var5 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field287, "/tmp/", ""};
         if (arg1 != 32) {
            this.field274 = (EventQueue)null;
         }

         for(int var7 = 0; var7 < 2; ++var7) {
            for(int var8 = 0; ~var6.length < ~var8; ++var8) {
               for(int var9 = 0; ~var5.length < ~var9; ++var9) {
                  try {
                     String var10 = var5[var9];
                     if (0 < var10.length() && !(new File(var10)).exists()) {
                        continue;
                     }

                     File var11 = new File(var10 + var6[var8]);
                     boolean var12;
                     if (~var7 == -2 && !var11.exists()) {
                        var12 = var11.mkdir();
                        if (!var12) {
                           continue;
                        }
                     }

                     File var19;
                     if (this.field273 == null) {
                        try {
                           var19 = new File(var11, "random.dat");
                           if (-2 == ~var7 || var19.exists()) {
                              this.field273 = new class24(var19, "rw", 25L);
                           }
                        } catch (Exception var16) {
                           this.field273 = null;
                        }
                     }

                     if (null == this.field286) {
                        int var13;
                        try {
                           var11 = new File(var11, arg2);
                           if (1 == var7 && !var11.exists()) {
                              var12 = var11.mkdir();
                              if (!var12) {
                                 continue;
                              }
                           }

                           var19 = new File(var11, "main_file_cache.dat2");
                           if (~var7 == -1 && !var19.exists()) {
                              continue;
                           }

                           this.field288 = new class24(var19, "rw", 52428800L);
                           this.field280 = new class24[arg3];

                           for(var13 = 0; arg3 > var13; ++var13) {
                              this.field280[var13] = new class24(new File(var11, "main_file_cache.idx" + var13), "rw", 1048576L);
                           }

                           this.field276 = new class24(new File(var11, "main_file_cache.idx255"), "rw", 1048576L);
                           this.field282 = this.field286 = var11;
                        } catch (Exception var15) {
                           try {
                              this.field288.method120(arg1 ^ 21689);

                              for(var13 = 0; ~var13 > ~arg3; ++var13) {
                                 this.field280[var13].method120(arg1 ^ 21689);
                              }

                              this.field276.method120(21657);
                           } catch (Exception var14) {
                           }

                           this.field282 = this.field286 = null;
                           this.field288 = this.field276 = null;
                           this.field280 = null;
                        }
                     }
                  } catch (Exception var17) {
                  }

                  if (null != this.field273 && null != this.field286) {
                     return;
                  }
               }
            }
         }

         if (this.field286 == null) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var18) {
         throw var18;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(IIIILjava/lang/Object;)Lta;",
      line = 311
   )
   private final class43 method182(int arg0, int arg1, int arg2, int arg3, Object arg4) {
      try {
         if (arg0 != -33) {
            return (class43)null;
         } else {
            class43 var6 = new class43();
            var6.field326 = arg1;
            var6.field325 = arg2;
            var6.field329 = arg4;
            synchronized(this) {
               if (this.field278 == null) {
                  this.field278 = this.field277 = var6;
               } else {
                  this.field278.field328 = var6;
                  this.field278 = var6;
               }

               this.notify();
            }

            return var6;
         }
      } catch (RuntimeException var10) {
         throw var10;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lta;",
      line = 345
   )
   public final class43 method183(int arg0, Class arg1, String arg2) {
      try {
         if (arg0 != -5134) {
            this.method186((byte)96);
         }

         return this.method182(-33, 0, 9, 0, new Object[]{arg1, arg2});
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(BI)Lta;",
      line = 359
   )
   public final class43 method184(byte arg0, int arg1) {
      try {
         if (arg0 <= 71) {
            this.method184((byte)0, 26);
         }

         return this.method182(-33, arg1, 3, 0, (Object)null);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(Ljava/lang/String;BI)Lta;",
      line = 391
   )
   public final class43 method185(String arg0, byte arg1, int arg2) {
      try {
         int var4 = 47 % ((-48 - arg1) / 33);
         return this.method182(-33, arg2, 1, 0, arg0);
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "a",
      descriptor = "(B)V",
      line = 412
   )
   public final void method186(byte arg0) {
      try {
         synchronized(this) {
            this.field275 = true;
            this.notifyAll();
         }

         int var2;
         try {
            var2 = -50 % ((arg0 - 72) / 45);
            this.field289.join();
         } catch (InterruptedException var8) {
         }

         if (null != this.field288) {
            try {
               this.field288.method120(21657);
            } catch (IOException var7) {
            }
         }

         if (this.field276 != null) {
            try {
               this.field276.method120(21657);
            } catch (IOException var6) {
            }
         }

         if (null != this.field280) {
            for(var2 = 0; ~var2 > ~this.field280.length; ++var2) {
               if (null != this.field280[var2]) {
                  try {
                     this.field280[var2].method120(21657);
                  } catch (IOException var5) {
                  }
               }
            }
         }

         if (null != this.field273) {
            try {
               this.field273.method120(21657);
            } catch (IOException var4) {
            }
         }

      } catch (RuntimeException var10) {
         throw var10;
      }
   }

   @OriginalMember(
      owner = "loginapplet!r",
      name = "<init>",
      descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V",
      line = 483
   )
   public class38(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
      try {
         field281 = "1.1";
         field279 = "Unknown";
         this.field272 = arg1;

         try {
            field279 = System.getProperty("java.vendor");
            field281 = System.getProperty("java.version");
         } catch (Exception var11) {
         }

         try {
            field287 = System.getProperty("user.home");
            if (field287 != null) {
               field287 = field287 + "/";
            }
         } catch (Exception var10) {
         }

         if (field287 == null) {
            field287 = "~/";
         }

         try {
            this.field274 = Toolkit.getDefaultToolkit().getSystemEventQueue();
         } catch (Throwable var9) {
         }

         try {
            if (null != arg1) {
               field285 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
               field285 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
         } catch (Exception var8) {
         }

         try {
            if (arg1 != null) {
               field284 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
               field284 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            }
         } catch (Exception var7) {
         }

         if (arg0) {
            this.method181(arg2, 32, arg3, arg4);
         }

         this.field275 = false;
         this.field289 = new Thread(this);
         this.field289.setPriority(10);
         this.field289.setDaemon(true);
         this.field289.start();
      } catch (RuntimeException var12) {
         throw var12;
      }
   }
}
