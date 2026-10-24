package deob;

@ObfuscatedName("EOSBSGLH")
public class EOSBSGLH {

	@ObfuscatedName("EOSBSGLH.i")
	public int field674 = 0;

	@ObfuscatedName("EOSBSGLH.j")
	public int field675 = 0;

	@ObfuscatedName("EOSBSGLH.k")
	public int field676;

	@ObfuscatedName("EOSBSGLH.l")
	public int field677;

	@ObfuscatedName("EOSBSGLH.m")
	public int[][] field678;

	public EOSBSGLH(int arg0, int arg1) {
		field676 = arg0;
		field677 = arg1;
		field678 = new int[field676][field677];
		method202();
	}

	@ObfuscatedName("EOSBSGLH.a()V")
	public void method202() {
		for (int var1 = 0; var1 < field676; var1++) {
			for (int var2 = 0; var2 < field677; var2++) {
				if (var1 == 0 || var2 == 0 || field676 - 1 == var1 || field677 - 1 == var2) {
					field678[var1][var2] = 0xFFFFFF;
				} else {
					field678[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("EOSBSGLH.a(ZIIIIZ)V")
	public void method203(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 -= field674;
		arg3 -= field675;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method206(arg1, arg3, 128);
				method206(arg1 - 1, arg3, 8);
			}

			if (arg2 == 1) {
				method206(arg1, arg3, 2);
				method206(arg1, arg3 + 1, 32);
			}

			if (arg2 == 2) {
				method206(arg1, arg3, 8);
				method206(arg1 + 1, arg3, 128);
			}

			if (arg2 == 3) {
				method206(arg1, arg3, 32);
				method206(arg1, arg3 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method206(arg1, arg3, 1);
				method206(arg1 - 1, arg3 + 1, 16);
			}

			if (arg2 == 1) {
				method206(arg1, arg3, 4);
				method206(arg1 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method206(arg1, arg3, 16);
				method206(arg1 + 1, arg3 - 1, 1);
			}

			if (arg2 == 3) {
				method206(arg1, arg3, 64);
				method206(arg1 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method206(arg1, arg3, 130);
				method206(arg1 - 1, arg3, 8);
				method206(arg1, arg3 + 1, 32);
			}

			if (arg2 == 1) {
				method206(arg1, arg3, 10);
				method206(arg1, arg3 + 1, 32);
				method206(arg1 + 1, arg3, 128);
			}

			if (arg2 == 2) {
				method206(arg1, arg3, 40);
				method206(arg1 + 1, arg3, 128);
				method206(arg1, arg3 - 1, 2);
			}

			if (arg2 == 3) {
				method206(arg1, arg3, 160);
				method206(arg1, arg3 - 1, 2);
				method206(arg1 - 1, arg3, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method206(arg1, arg3, 0x10000);
					method206(arg1 - 1, arg3, 4096);
				}

				if (arg2 == 1) {
					method206(arg1, arg3, 1024);
					method206(arg1, arg3 + 1, 16384);
				}

				if (arg2 == 2) {
					method206(arg1, arg3, 4096);
					method206(arg1 + 1, arg3, 0x10000);
				}

				if (arg2 == 3) {
					method206(arg1, arg3, 16384);
					method206(arg1, arg3 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method206(arg1, arg3, 512);
					method206(arg1 - 1, arg3 + 1, 8192);
				}

				if (arg2 == 1) {
					method206(arg1, arg3, 2048);
					method206(arg1 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method206(arg1, arg3, 8192);
					method206(arg1 + 1, arg3 - 1, 512);
				}

				if (arg2 == 3) {
					method206(arg1, arg3, 32768);
					method206(arg1 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method206(arg1, arg3, 66560);
					method206(arg1 - 1, arg3, 4096);
					method206(arg1, arg3 + 1, 16384);
				}

				if (arg2 == 1) {
					method206(arg1, arg3, 5120);
					method206(arg1, arg3 + 1, 16384);
					method206(arg1 + 1, arg3, 0x10000);
				}

				if (arg2 == 2) {
					method206(arg1, arg3, 20480);
					method206(arg1 + 1, arg3, 0x10000);
					method206(arg1, arg3 - 1, 1024);
				}

				if (arg2 == 3) {
					method206(arg1, arg3, 81920);
					method206(arg1, arg3 - 1, 1024);
					method206(arg1 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EOSBSGLH.a(IIIIIZI)V")
	public void method204(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg3 -= field674;
		arg1 -= field675;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg0;
			arg0 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field676) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field677) {
						method206(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("EOSBSGLH.a(III)V")
	public void method205(int arg0, int arg1) {
		arg0 -= field674;
		arg1 -= field675;
		field678[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("EOSBSGLH.b(III)V")
	public void method206(int arg0, int arg1, int arg2) {
		field678[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("EOSBSGLH.a(IIZIII)V")
	public void method207(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field674;
		arg0 -= field675;
		if (arg3 == 0) {
			if (arg4 == 0) {
				method209(128, arg1, arg0);
				method209(8, arg1 - 1, arg0);
			}

			if (arg4 == 1) {
				method209(2, arg1, arg0);
				method209(32, arg1, arg0 + 1);
			}

			if (arg4 == 2) {
				method209(8, arg1, arg0);
				method209(128, arg1 + 1, arg0);
			}

			if (arg4 == 3) {
				method209(32, arg1, arg0);
				method209(2, arg1, arg0 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				method209(1, arg1, arg0);
				method209(16, arg1 - 1, arg0 + 1);
			}

			if (arg4 == 1) {
				method209(4, arg1, arg0);
				method209(64, arg1 + 1, arg0 + 1);
			}

			if (arg4 == 2) {
				method209(16, arg1, arg0);
				method209(1, arg1 + 1, arg0 - 1);
			}

			if (arg4 == 3) {
				method209(64, arg1, arg0);
				method209(4, arg1 - 1, arg0 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg4 == 0) {
				method209(130, arg1, arg0);
				method209(8, arg1 - 1, arg0);
				method209(32, arg1, arg0 + 1);
			}

			if (arg4 == 1) {
				method209(10, arg1, arg0);
				method209(32, arg1, arg0 + 1);
				method209(128, arg1 + 1, arg0);
			}

			if (arg4 == 2) {
				method209(40, arg1, arg0);
				method209(128, arg1 + 1, arg0);
				method209(2, arg1, arg0 - 1);
			}

			if (arg4 == 3) {
				method209(160, arg1, arg0);
				method209(2, arg1, arg0 - 1);
				method209(8, arg1 - 1, arg0);
			}
		}

		if (arg2) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					method209(0x10000, arg1, arg0);
					method209(4096, arg1 - 1, arg0);
				}

				if (arg4 == 1) {
					method209(1024, arg1, arg0);
					method209(16384, arg1, arg0 + 1);
				}

				if (arg4 == 2) {
					method209(4096, arg1, arg0);
					method209(0x10000, arg1 + 1, arg0);
				}

				if (arg4 == 3) {
					method209(16384, arg1, arg0);
					method209(1024, arg1, arg0 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					method209(512, arg1, arg0);
					method209(8192, arg1 - 1, arg0 + 1);
				}

				if (arg4 == 1) {
					method209(2048, arg1, arg0);
					method209(32768, arg1 + 1, arg0 + 1);
				}

				if (arg4 == 2) {
					method209(8192, arg1, arg0);
					method209(512, arg1 + 1, arg0 - 1);
				}

				if (arg4 == 3) {
					method209(32768, arg1, arg0);
					method209(2048, arg1 - 1, arg0 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg4 == 0) {
					method209(66560, arg1, arg0);
					method209(4096, arg1 - 1, arg0);
					method209(16384, arg1, arg0 + 1);
				}

				if (arg4 == 1) {
					method209(5120, arg1, arg0);
					method209(16384, arg1, arg0 + 1);
					method209(0x10000, arg1 + 1, arg0);
				}

				if (arg4 == 2) {
					method209(20480, arg1, arg0);
					method209(0x10000, arg1 + 1, arg0);
					method209(1024, arg1, arg0 - 1);
				}

				if (arg4 == 3) {
					method209(81920, arg1, arg0);
					method209(1024, arg1, arg0 - 1);
					method209(4096, arg1 - 1, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EOSBSGLH.a(IIIIIIZ)V")
	public void method208(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg3 -= field674;
		arg2 -= field675;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field676) {
				for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field677) {
						method209(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("EOSBSGLH.a(IIBI)V")
	public void method209(int arg0, int arg1, int arg2) {
		field678[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("EOSBSGLH.a(IBI)V")
	public void method210(int arg0, int arg1) {
		arg0 -= field674;
		arg1 -= field675;
		field678[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("EOSBSGLH.a(BIIIIII)Z")
	public boolean method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg3 && arg0 == arg2) {
			return true;
		}

		arg1 -= field674;
		arg2 -= field675;
		arg3 -= field674;
		arg0 -= field675;
		if (arg4 == 0) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg2 && (field678[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg2 && (field678[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 == arg3 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg3 - 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg2 && (field678[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg2 && (field678[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 == arg3 && arg0 - 1 == arg2) {
					return true;
				}

				if (arg3 - 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg2 && (field678[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 - 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg2) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg2 && (field678[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 - 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg2 && (field678[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg2) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg2 && (field678[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg1 == arg3 && arg0 + 1 == arg2 && (field678[arg1][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg3 && arg0 - 1 == arg2 && (field678[arg1][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg1 && arg0 == arg2 && (field678[arg1][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EOSBSGLH.a(IIIIIII)Z")
	public boolean method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg3 && arg2 == arg4) {
			return true;
		}

		arg3 -= field674;
		arg4 -= field675;
		arg1 -= field674;
		arg2 -= field675;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg1 + 1 == arg3 && arg2 == arg4 && (field678[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4 && (field678[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 - 1 == arg3 && arg2 == arg4 && (field678[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4 && (field678[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg1 - 1 == arg3 && arg2 == arg4 && (field678[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4 && (field678[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 + 1 == arg3 && arg2 == arg4 && (field678[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4 && (field678[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg1 == arg3 && arg2 + 1 == arg4 && (field678[arg3][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg3 && arg2 - 1 == arg4 && (field678[arg3][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg3 && arg2 == arg4 && (field678[arg3][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg3 && arg2 == arg4 && (field678[arg3][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EOSBSGLH.a(IIIIIIII)Z")
	public boolean method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg5 - 1;
		int var9 = arg0 + arg4 - 1;
		if (arg2 >= arg5 && arg2 <= var8 && arg6 >= arg0 && arg6 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg2 && arg6 >= arg0 && arg6 <= var9 && (field678[arg2 - field674][arg6 - field675] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg6 >= arg0 && arg6 <= var9 && (field678[arg2 - field674][arg6 - field675] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg6 && arg2 >= arg5 && arg2 <= var8 && (field678[arg2 - field674][arg6 - field675] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg2 >= arg5 && arg2 <= var8 && (field678[arg2 - field674][arg6 - field675] & 0x20) == 0 && (arg3 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
