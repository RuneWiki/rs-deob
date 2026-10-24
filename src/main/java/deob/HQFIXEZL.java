package deob;

@ObfuscatedName("HQFIXEZL")
public class HQFIXEZL {

	@ObfuscatedName("HQFIXEZL.f")
	public int field663 = 0;

	@ObfuscatedName("HQFIXEZL.g")
	public int field664 = 0;

	@ObfuscatedName("HQFIXEZL.h")
	public int field665;

	@ObfuscatedName("HQFIXEZL.i")
	public int field666;

	@ObfuscatedName("HQFIXEZL.j")
	public int[][] field667;

	public HQFIXEZL(int arg0, int arg1) {
		field665 = arg1;
		field666 = arg0;
		field667 = new int[field665][field666];
		method300();
	}

	@ObfuscatedName("HQFIXEZL.a()V")
	public void method300() {
		for (int var1 = 0; var1 < field665; var1++) {
			for (int var2 = 0; var2 < field666; var2++) {
				if (var1 == 0 || var2 == 0 || field665 - 1 == var1 || field666 - 1 == var2) {
					field667[var1][var2] = 0xFFFFFF;
				} else {
					field667[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("HQFIXEZL.a(IIZZII)V")
	public void method301(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field663;
		arg4 -= field664;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method304(arg1, arg4, 128);
				method304(arg1 - 1, arg4, 8);
			}

			if (arg3 == 1) {
				method304(arg1, arg4, 2);
				method304(arg1, arg4 + 1, 32);
			}

			if (arg3 == 2) {
				method304(arg1, arg4, 8);
				method304(arg1 + 1, arg4, 128);
			}

			if (arg3 == 3) {
				method304(arg1, arg4, 32);
				method304(arg1, arg4 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method304(arg1, arg4, 1);
				method304(arg1 - 1, arg4 + 1, 16);
			}

			if (arg3 == 1) {
				method304(arg1, arg4, 4);
				method304(arg1 + 1, arg4 + 1, 64);
			}

			if (arg3 == 2) {
				method304(arg1, arg4, 16);
				method304(arg1 + 1, arg4 - 1, 1);
			}

			if (arg3 == 3) {
				method304(arg1, arg4, 64);
				method304(arg1 - 1, arg4 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method304(arg1, arg4, 130);
				method304(arg1 - 1, arg4, 8);
				method304(arg1, arg4 + 1, 32);
			}

			if (arg3 == 1) {
				method304(arg1, arg4, 10);
				method304(arg1, arg4 + 1, 32);
				method304(arg1 + 1, arg4, 128);
			}

			if (arg3 == 2) {
				method304(arg1, arg4, 40);
				method304(arg1 + 1, arg4, 128);
				method304(arg1, arg4 - 1, 2);
			}

			if (arg3 == 3) {
				method304(arg1, arg4, 160);
				method304(arg1, arg4 - 1, 2);
				method304(arg1 - 1, arg4, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method304(arg1, arg4, 0x10000);
					method304(arg1 - 1, arg4, 4096);
				}

				if (arg3 == 1) {
					method304(arg1, arg4, 1024);
					method304(arg1, arg4 + 1, 16384);
				}

				if (arg3 == 2) {
					method304(arg1, arg4, 4096);
					method304(arg1 + 1, arg4, 0x10000);
				}

				if (arg3 == 3) {
					method304(arg1, arg4, 16384);
					method304(arg1, arg4 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method304(arg1, arg4, 512);
					method304(arg1 - 1, arg4 + 1, 8192);
				}

				if (arg3 == 1) {
					method304(arg1, arg4, 2048);
					method304(arg1 + 1, arg4 + 1, 32768);
				}

				if (arg3 == 2) {
					method304(arg1, arg4, 8192);
					method304(arg1 + 1, arg4 - 1, 512);
				}

				if (arg3 == 3) {
					method304(arg1, arg4, 32768);
					method304(arg1 - 1, arg4 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method304(arg1, arg4, 66560);
					method304(arg1 - 1, arg4, 4096);
					method304(arg1, arg4 + 1, 16384);
				}

				if (arg3 == 1) {
					method304(arg1, arg4, 5120);
					method304(arg1, arg4 + 1, 16384);
					method304(arg1 + 1, arg4, 0x10000);
				}

				if (arg3 == 2) {
					method304(arg1, arg4, 20480);
					method304(arg1 + 1, arg4, 0x10000);
					method304(arg1, arg4 - 1, 1024);
				}

				if (arg3 == 3) {
					method304(arg1, arg4, 81920);
					method304(arg1, arg4 - 1, 1024);
					method304(arg1 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("HQFIXEZL.a(IIIIIIZ)V")
	public void method302(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg1 -= field663;
		arg0 -= field664;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field665) {
				for (int var10 = arg0; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field666) {
						method304(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("HQFIXEZL.a(III)V")
	public void method303(int arg0, int arg1) {
		arg0 -= field663;
		arg1 -= field664;
		field667[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("HQFIXEZL.b(III)V")
	public void method304(int arg0, int arg1, int arg2) {
		field667[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("HQFIXEZL.a(ZBIIII)V")
	public void method305(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field663;
		arg4 -= field664;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method307(arg4, arg3, 128);
				method307(arg4, arg3 - 1, 8);
			}

			if (arg2 == 1) {
				method307(arg4, arg3, 2);
				method307(arg4 + 1, arg3, 32);
			}

			if (arg2 == 2) {
				method307(arg4, arg3, 8);
				method307(arg4, arg3 + 1, 128);
			}

			if (arg2 == 3) {
				method307(arg4, arg3, 32);
				method307(arg4 - 1, arg3, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method307(arg4, arg3, 1);
				method307(arg4 + 1, arg3 - 1, 16);
			}

			if (arg2 == 1) {
				method307(arg4, arg3, 4);
				method307(arg4 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method307(arg4, arg3, 16);
				method307(arg4 - 1, arg3 + 1, 1);
			}

			if (arg2 == 3) {
				method307(arg4, arg3, 64);
				method307(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method307(arg4, arg3, 130);
				method307(arg4, arg3 - 1, 8);
				method307(arg4 + 1, arg3, 32);
			}

			if (arg2 == 1) {
				method307(arg4, arg3, 10);
				method307(arg4 + 1, arg3, 32);
				method307(arg4, arg3 + 1, 128);
			}

			if (arg2 == 2) {
				method307(arg4, arg3, 40);
				method307(arg4, arg3 + 1, 128);
				method307(arg4 - 1, arg3, 2);
			}

			if (arg2 == 3) {
				method307(arg4, arg3, 160);
				method307(arg4 - 1, arg3, 2);
				method307(arg4, arg3 - 1, 8);
			}
		}

		if (arg0) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method307(arg4, arg3, 0x10000);
					method307(arg4, arg3 - 1, 4096);
				}

				if (arg2 == 1) {
					method307(arg4, arg3, 1024);
					method307(arg4 + 1, arg3, 16384);
				}

				if (arg2 == 2) {
					method307(arg4, arg3, 4096);
					method307(arg4, arg3 + 1, 0x10000);
				}

				if (arg2 == 3) {
					method307(arg4, arg3, 16384);
					method307(arg4 - 1, arg3, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method307(arg4, arg3, 512);
					method307(arg4 + 1, arg3 - 1, 8192);
				}

				if (arg2 == 1) {
					method307(arg4, arg3, 2048);
					method307(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method307(arg4, arg3, 8192);
					method307(arg4 - 1, arg3 + 1, 512);
				}

				if (arg2 == 3) {
					method307(arg4, arg3, 32768);
					method307(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method307(arg4, arg3, 66560);
					method307(arg4, arg3 - 1, 4096);
					method307(arg4 + 1, arg3, 16384);
				}

				if (arg2 == 1) {
					method307(arg4, arg3, 5120);
					method307(arg4 + 1, arg3, 16384);
					method307(arg4, arg3 + 1, 0x10000);
				}

				if (arg2 == 2) {
					method307(arg4, arg3, 20480);
					method307(arg4, arg3 + 1, 0x10000);
					method307(arg4 - 1, arg3, 1024);
				}

				if (arg2 == 3) {
					method307(arg4, arg3, 81920);
					method307(arg4 - 1, arg3, 1024);
					method307(arg4, arg3 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("HQFIXEZL.a(BIZIIII)V")
	public void method306(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg3 -= field663;
		arg4 -= field664;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field665) {
				for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field666) {
						method307(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("HQFIXEZL.a(IIII)V")
	public void method307(int arg0, int arg1, int arg2) {
		field667[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("HQFIXEZL.c(III)V")
	public void method308(int arg0, int arg1) {
		arg0 -= field663;
		arg1 -= field664;
		field667[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("HQFIXEZL.a(IIIIIII)Z")
	public boolean method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg3 == arg5) {
			return true;
		}

		arg1 -= field663;
		arg5 -= field664;
		arg4 -= field663;
		arg3 -= field664;
		if (arg0 == 0) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field667[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field667[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 + 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field667[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field667[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 == arg4 && arg3 - 1 == arg5) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field667[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 - 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field667[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 - 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field667[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 - 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field667[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg4 && arg3 + 1 == arg5 && (field667[arg1][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg3 - 1 == arg5 && (field667[arg1][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg1 && arg3 == arg5 && (field667[arg1][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("HQFIXEZL.b(IIIIIII)Z")
	public boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg3 == arg5) {
			return true;
		}

		arg0 -= field663;
		arg3 -= field664;
		arg1 -= field663;
		arg5 -= field664;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg1 + 1 == arg0 && arg3 == arg5 && (field667[arg0][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3 && (field667[arg0][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 - 1 == arg0 && arg3 == arg5 && (field667[arg0][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3 && (field667[arg0][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg1 - 1 == arg0 && arg3 == arg5 && (field667[arg0][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3 && (field667[arg0][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 + 1 == arg0 && arg3 == arg5 && (field667[arg0][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3 && (field667[arg0][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg0 == arg1 && arg5 + 1 == arg3 && (field667[arg0][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg5 - 1 == arg3 && (field667[arg0][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg0 && arg3 == arg5 && (field667[arg0][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg0 && arg3 == arg5 && (field667[arg0][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("HQFIXEZL.a(IIIIIIII)Z")
	public boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg6 - 1;
		int var9 = arg0 + arg1 - 1;
		if (arg5 >= arg6 && arg5 <= var8 && arg4 >= arg0 && arg4 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg4 >= arg0 && arg4 <= var9 && (field667[arg5 - field663][arg4 - field664] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg4 >= arg0 && arg4 <= var9 && (field667[arg5 - field663][arg4 - field664] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg4 && arg5 >= arg6 && arg5 <= var8 && (field667[arg5 - field663][arg4 - field664] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg5 >= arg6 && arg5 <= var8 && (field667[arg5 - field663][arg4 - field664] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
